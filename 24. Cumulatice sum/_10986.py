n, m = map(int, input().split())
numbers = tuple(map(int, input().split()))

# 시작 위치에 따라 m으로 나누어 떨어지는 수 계산
dp = [-1 for _ in range(n)]
for i in range(n):
    sum_num = 0

    for j in range(i, n):
        sum_num += numbers[j]

        if sum_num % m == 0:
            dp[i] = j
            break

# m으로 나누어 떨어지는 구간의 계산
answer = 0
for start in range(n):
    pointer = start

    while (pointer < n and dp[pointer] != -1):
        answer += 1
        pointer = dp[pointer] + 1

print(answer)
