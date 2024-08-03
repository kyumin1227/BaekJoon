from sys import stdin

input = stdin.readline

n = int(input())
dp = [0] * n

for i in range(n):
    dp[i] = list(map(int, input().split()))

# 양 끝인 경우에는 한가지 경우 밖에 없지만 중간인 경우에는 n - 1의 값 둘 중 큰 값을 가져옴
for i in range(1, n):
    for j in range(len(dp[i])):
        if j == 0:
            dp[i][j] = dp[i][j] + dp[i - 1][j]
        elif j == len(dp[i]) - 1:
            dp[i][j] = dp[i][j] + dp[i - 1][j - 1]
        else:
            dp[i][j] = dp[i][j] + max(dp[i - 1][j - 1], dp[i - 1][j])

print(max(dp[n - 1]))
