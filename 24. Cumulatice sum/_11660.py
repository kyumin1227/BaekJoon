from sys import stdin

input = stdin.readline

n, m = map(int, input().split())

pre_sum = [[0]] # 구간 합

# 라인별로 구간 합 구하기
for _ in range(n):
    number_list = list(map(int, input().split()))
    pre_sum_list = [0]

    for i in range(n):
        pre_sum_list.append(pre_sum_list[i] + number_list[i])

    pre_sum.append(pre_sum_list)

# 계산 및 출력
for _ in range(m):
    start_y, start_x, end_y, end_x= map(int, input().split())
    result = 0
    
    for y in range(start_y, end_y + 1):
        result += pre_sum[y][end_x] - pre_sum[y][start_x - 1]
    
    print(result)
