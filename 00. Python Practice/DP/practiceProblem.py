N = int(input())

whs = list(map(int, input().split()))

dp = [0] * N

dp[0] = whs[0]
dp[1] = max(dp[0], whs[1])

for i in range(2, N):
    dp[i] = max(dp[i - 1], dp[i - 2] + whs[i])
    
print(dp[N - 1])