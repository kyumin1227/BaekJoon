import sys

dp = [0] * 101

dp[1] = 1
dp[2] = 1
dp[3] = 1
dp[4] = 2

for i in range(5, 101):
    dp[i] = dp[i - 1] + dp[i - 5]

T = int(sys.stdin.readline())

for _ in range(T):
    sys.stdout.write(str(dp[int(sys.stdin.readline())]) + "\n")

sys.stdout.flush()
sys.stdout.close()