from sys import stdin

def cal_board(x1, y1, x2, y2):
    """n 크기의 체스판 크기를 구해주는 함수"""
    result = dp[y2 + 1][x2 + 1] - dp[y2 + 1][x1] - dp[y1][x2 + 1] + dp[y1][x1]
    return result

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

# 구간합 계산
dp = [[0 for _ in range(w + 1)] for _ in range(h + 1)]

for x in range(w):
    for y in range(h):
        dp[y + 1][x + 1] = datas[y][x] + dp[y + 1][x] + dp[y][x + 1] - dp[y][x]

# 결과 계산
min_num = n * n

for x in range(w - n + 1):
    for y in range(h - n + 1):
        result = cal_board(x, y, x + n - 1, y + n - 1)
        min_num = min(min_num, result, n * n - result)

print(min_num)
