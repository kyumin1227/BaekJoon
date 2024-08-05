from sys import stdin

input = stdin.readline

n = int(input())
healths = list(map(int, input().split()))
pleasures = list(map(int, input().split()))
health = 100

dp = [[0 for _ in range(101)] for _ in range(n + 1)]

for i in range(1, n + 1):   # 사람
    h = healths[i - 1]
    p = pleasures[i - 1]
    for j in range(99, 0, -1):  # 체력
        # 인사를 할 체력이 있는 경우
        if j + h <= 100:
            # 인사를 안한 경우(이번 사람 고려 안한 경우, 체력이 더 많이 남은 경우), 인사를 한 경우 중 큰 값
            dp[i][j] = max(dp[i - 1][j], dp[i][j + 1], dp[i - 1][j + h] + p)
        # 체력이 없는 경우
        else:
            # 이번 사람 고려 안한 경우, 체력이 더 많이 남은 경우
            dp[i][j] = max(dp[i - 1][j], dp[i][j + 1])

print(dp[n][1])
