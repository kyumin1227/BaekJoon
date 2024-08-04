from sys import stdin

input = stdin.readline

n = int(input())
dp = [0] * (n + 1)
nums = [0]

for _ in range(n):
    nums.append(int(input()))

dp[1] = nums[1]
if n > 1:
    dp[2] = nums[1] + nums[2]

for i in range(3, n + 1):
    # 1. i번째의 와인을 선택하지 않는 경우
    # 2. i - 1번째의 와인을 선택하지 않는 경우
    # 3. i - 2번째의 와인을 선택하지 않는 경우
    dp[i] = max(dp[i - 1], dp[i - 2] + nums[i], dp[i - 3] + nums[i - 1] + nums[i])

print(dp[n])
