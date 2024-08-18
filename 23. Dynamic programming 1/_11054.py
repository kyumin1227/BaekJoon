from sys import stdin

input = stdin.readline

n = int(input())
datas = list(map(int, input().split()))

dp = [[1, 1] for _ in range(n)]

# 앞에서 부터의 가장 긴 증가하는 수열을 계산
for i in range(1, n):
    for j in range(i):
        if datas[i] > datas[j] and dp[i][0] < dp[j][0] + 1:
            dp[i][0] = dp[j][0] + 1

# 뒤에서 부터의 가장 긴 증가하는 수열을 구함
for i in range(n - 2, -1, -1):
    for j in range(n - 1, i, -1):
        if datas[i] > datas[j] and dp[i][1] < dp[j][1] + 1:
            dp[i][1] = dp[j][1] + 1

# 인덱스 0과 1의 합계가 가장 큰 값을 구하고 -1 하여 출력
print(sum(max(dp, key=lambda x : sum(x))) - 1)
