import sys

input = sys.stdin.readline

MAX_NUM = 1000000

temp_list = [1] * (MAX_NUM + 1)
dp = [0] * (MAX_NUM + 1)

dp[1] = 1

for i in range(2, MAX_NUM + 1):
    for j in range(i, MAX_NUM + 1, i):
        temp_list[j] += i
    dp[i] = dp[i - 1] + temp_list[i]

t = int(input())

for i in range(t):
    num = int(input())
    sys.stdout.write(str(dp[num]) + "\n")