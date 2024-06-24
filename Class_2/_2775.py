from sys import stdin

dp = [[0 for _ in range(15)] for _ in range(15)]

for i in range(15):
    for j in range(15):
        if i == 0:
            dp[i][j] = j
        else:
            dp[i][j] = sum([dp[i - 1][z] for z in range(j + 1)])

input = stdin.readline
T = int(input())

for i in range(T):
    k = int(input())
    n = int(input())
    print(dp[k][n])