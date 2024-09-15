from sys import stdin

input = stdin.readline

h, w, n = map(int, input().split())
datas = []
t_default = "B"
# B 시작으로 계산하여 잘못된 값이 들어오면 1 적절한 값이면 0 으로 받음
for _ in range(h):
    temp = []
    t = t_default
    for c in input().rstrip():
        temp.append(0 if c == t else 1)
        t = "W" if t == "B" else "B"
    datas.append(temp)
    t_default = "W" if t_default == "B" else "B"

datas.append([0 for _ in range(w)])

# 각 결과를 저장할 dp 리스트 생성
dp = [[0 for _ in range(w - n + 1)] for _ in range(h - n + 1)]

for i in range(n):
    for j in range(n):
        dp[0][0] += datas[i][j]

# 각 체스판 별로 체크
for y in range(h - n + 1):

    # x가 0인 경우에는 위에서 한칸 내려서 계산 (y - 1)
    if y != 0:
        dp[y][0] = dp[y - 1][0]
        for i in range(n):
            dp[y][0] -= datas[y - 1][i]
            dp[y][0] += datas[y + n - 1][i]
    
    # x가 1 이상인 경우에는 옆에서 한칸 밀어서 계산 (x - 1)
    for x in range(1, w - n + 1):
        if y == 0 and x == 0:
            continue

        dp[y][x] = dp[y][x - 1]
        for i in range(y, y + n):
            dp[y][x] -= datas[i][x - 1]
            dp[y][x] += datas[i][x + n - 1]

min_num = n * n

for line in dp:
    for num in line:
        # 현재의 최솟값, B 시작의  값, W 시작의 값 중 최솟값 가져옴
        min_num = min(min_num, num, n * n - num)

print(min_num)