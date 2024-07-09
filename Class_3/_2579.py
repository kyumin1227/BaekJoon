from sys import stdin

input = stdin.readline

n = int(input())

# 최대값 == 300
stairs = [0] * 301
dp = [0] * 301

for i in range(1, n + 1):
    stairs[i] = int(input())

# 3 이하는 직접 설정
dp[1] = stairs[1]
dp[2] = stairs[1] + stairs[2]
dp[3] = max(stairs[1] + stairs[3], stairs[2] + stairs[3])

for i in range(4, n + 1):
    # i - 2번째 칸을 비우는 경우랑 i - 1번째 칸을 비우는 경우 비교
    dp[i] = max(dp[i - 3] + stairs[i - 1] + stairs[i], dp[i - 2] + stairs[i])

print(dp[n])