from sys import stdin

input = stdin.readline

n, m, k = map(int, input().split())
board = []

pre_sum = [[], []]  # 0 = 블랙 스타트, 1 = 화이트 스타트

for _ in range(n):
    temp = []
    for c in list(input().rstrip()):
        if c == "B":
            temp.append(True)
        else:
            temp.append(False)
    
    pre_sum_temp_black = [0]
    pre_sum_temp_white = [0]

    # 블랙 스타트랑 화이트 스타트 별로 바꿔야 하는 개수 저장
    for i in range(len(temp)):
        if i % 2 == 0 and temp[i]:
            pre_sum_temp_black.append(pre_sum_temp_black[i])
            pre_sum_temp_white.append(pre_sum_temp_white[i] + 1)
        elif i % 2 == 1 and not temp[i]:
            pre_sum_temp_black.append(pre_sum_temp_black[i])
            pre_sum_temp_white.append(pre_sum_temp_white[i] + 1)
        else:
            pre_sum_temp_black.append(pre_sum_temp_black[i] + 1)
            pre_sum_temp_white.append(pre_sum_temp_white[i])

    pre_sum[0].append(pre_sum_temp_black)
    pre_sum[1].append(pre_sum_temp_white)

result = k * k

for start_x in range(m - k + 1):
    for start_y in range(n - k + 1):
        
        black_start = 0
        white_start = 0

        # start_x, start_y 에서 시작한 k * k 체스판 계산
        for y in range(start_y, start_y + k):
            black_start += pre_sum[y % 2][y][start_x + k]\
                  - pre_sum[y % 2][y][start_x]
            white_start += pre_sum[1 if y % 2 == 0 else 0][y][start_x + k]\
                  - pre_sum[1 if y % 2 == 0 else 0][y][start_x]

        # 현재 최소값 보다 작으면 갱신
        result = min(result, black_start, white_start)

        if result == 0:
            print(result)
            exit()

print(result)
