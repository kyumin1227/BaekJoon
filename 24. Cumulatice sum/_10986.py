from sys import stdin
input = stdin.readline

n, m = map(int, input().split())
numbers = tuple(map(int, input().split()))

r = [0] * m

sum_number = 0
for i in range(n):
    sum_number += numbers[i]
    r[sum_number % m] += 1

answer = r[0]
# 나머지 n - 나머지 n = 0 이므로 nC2 계산
for i in range(m):
    answer += (r[i] ** 2 - r[i]) // 2

print(answer)