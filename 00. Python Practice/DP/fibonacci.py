def fibo(x):
    if(x == 1 or x == 2):
        return 1
    if(dp[x] != 0):
        return dp[x]
    dp[x] = fibo(x - 1) + fibo(x - 2)
    return dp[x]

n = int(input())

dp = [0] * (n + 1)

print(fibo(n))