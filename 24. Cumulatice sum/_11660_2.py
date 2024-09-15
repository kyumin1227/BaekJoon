n, m = map(int, input().split())

datas = []

for _ in range(n):
    temp = list(map(int, input().split()))
    datas.append(temp)

pre_sum = [[0 for _ in range(n + 1)] for _ in range(n + 1)]

# 누적합 계산
for x in range(1, n + 1):
    for y in range(1, n + 1):
        pre_sum[y][x] = pre_sum[y - 1][x] + pre_sum[y][x - 1] - pre_sum[y - 1][x - 1] + datas[y - 1][x - 1]

# 결과 출력
for _ in range(m):
    y1, x1, y2, x2 = map(int, input().split())
    print(pre_sum[y2][x2] - pre_sum[y1 - 1][x2] - pre_sum[y2][x1 - 1] + pre_sum[y1 - 1][x1 - 1])
