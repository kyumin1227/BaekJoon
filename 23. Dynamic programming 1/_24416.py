def fibonacci(arg_n):
    global count1
    if arg_n == 1 or arg_n == 2:
        count1 += 1
        return 1
    return fibonacci(arg_n - 1) + fibonacci(arg_n - 2)

def fibonacci_dp(arg_n):
    for i in range(3, arg_n + 1):
        dp[i] = dp[i - 1] + dp[i - 2]
    
    return dp[arg_n]


n = int(input())

dp = [1] * (n + 1)

count1 = 0

fibonacci(n)
fibonacci_dp(n)

print(count1, n - 2)
