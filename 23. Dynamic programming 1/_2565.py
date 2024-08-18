from sys import stdin

input = stdin.readline

n = int(input())
datas = []
dp = [1] * n

for _ in range(n):
    datas.append(tuple(map(int, input().split())))

# index 0의 숫자가 작은 순서대로 정렬
datas.sort(key=lambda x : x[0])

# 가장 증가하는 수열을 구함
for i in range(1, n):
    for j in range(i):
        if datas[i][1] > datas[j][1] and dp[i] < dp[j] + 1:
            dp[i] = dp[j] + 1

print(n - max(dp))
