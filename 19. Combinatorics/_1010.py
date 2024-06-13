t = int(input())

count = 0

for i in range(t):
    n, m = map(int, input().split())
    
    dp = [[0 for _ in range(n + 1)] for _ in range(m + 1)]

    # dp에 값 세팅
    for m in range(1, m + 1):
        for n in range(1, n + 1):
            if n == 1:
                dp[m][n] = m
                continue
            if m == n:
                dp[m][n] = 1
                continue
            dp[m][n] = dp[m - 1][n - 1] + dp[m - 1][n]

    print(dp[m][n])