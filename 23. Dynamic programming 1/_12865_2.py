from sys import stdin

input = stdin.readline

n, k = map(int, input().split())
items = []
dp = [[0 for _ in range(k + 1)] for _ in range(n + 1)]

for _ in range(n):
    items.append(tuple(map(int, input().split())))

for i in range(1, n + 1):  # 아이템
    now_weight, now_value = items[i - 1]
    for j in range(k + 1):  # 무게
        append = False
        if now_weight > j:
            # 현재 무게가 j보다 높으면 이전 인덱스의 값을 가져옴
            dp[i][j] = dp[i - 1][j]
        else:
            # 현재 물건을 추가한 값과 추가하지 않은 값을 비교하여 큰 값 추가
            dp[i][j] = max(dp[i - 1][j - now_weight] + now_value, dp[i - 1][j])

print(dp[n][k])
