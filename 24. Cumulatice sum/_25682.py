from sys import stdin

input = stdin.readline

n, m, k = map(int, input().split())
board = []

pre_sum = []

black = 0
white = 1

for _ in range(n):
    temp = []
    for c in list(input().rstrip()):
        if c == "B":
            temp.append(True)
        else:
            temp.append(False)
    
    pre_sum_temp_black = [0]

    # 바꿔야 하는 개수 저장
    for i in range(len(temp)):
        if i % 2 == black and temp[i]:
            pre_sum_temp_black.append(pre_sum_temp_black[i])
        elif i % 2 == white and not temp[i]:
            pre_sum_temp_black.append(pre_sum_temp_black[i])
        else:
            pre_sum_temp_black.append(pre_sum_temp_black[i] + 1)

    pre_sum.append(pre_sum_temp_black)

    # 한 줄이 끝나면 블랙 화이트 변경
    black, white = white, black

result = k * k

for start_x in range(m - k + 1):
    for start_y in range(n - k + 1):
        
        black_start = 0

        # start_x, start_y 에서 시작한 k * k 체스판 계산
        for y in range(start_y, start_y + k):
            black_start += pre_sum[y][start_x + k]\
                  - pre_sum[y][start_x]

        # 현재 최소값 보다 작으면 갱신
        result = min(result, black_start, k * k - black_start)

        if result == 0:
            print(result)
            exit()

print(result)
