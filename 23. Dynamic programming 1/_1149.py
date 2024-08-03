from sys import stdin

input = stdin.readline
n = int(input())

dp = [0] * n

for i in range(n):
    dp[i] = list(map(int, input().split()))

for i in range(1, n):   # n번째의 숫자와 해당 인덱스를 제외한 n - 1의 숫자의 최소값을 더해 나감
    dp[i][0] = dp[i][0] + min(dp[i - 1][1], dp[i - 1][2])
    dp[i][1] = dp[i][1] + min(dp[i - 1][0], dp[i - 1][2])
    dp[i][2] = dp[i][2] + min(dp[i - 1][0], dp[i - 1][1])

print(min(dp[n - 1][0], dp[n - 1][1], dp[n - 1][2]))
