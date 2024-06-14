import sys

t = int(input())

input = sys.stdin.readlines

num_list = [list(map(int, numbers.split())) for numbers in input()]

max_n = 0
max_m = 0

# 최대값 구함
for n, m in num_list:
    if n > max_n:
        max_n = n
    if m > max_m:
        max_m = m

dp = [[0 for _ in range(max_n + 1)] for _ in range(max_m + 1)]

# dp에 값 세팅
for m in range(1, max_m + 1):
    for n in range(1, max_n + 1):
        if n == 1:
            dp[m][n] = m
            continue
        if m == n:
            dp[m][n] = 1
            continue
        dp[m][n] = dp[m - 1][n - 1] + dp[m - 1][n]

for n, m in num_list:
    print(dp[m][n])