import sys

input = sys.stdin.readline

n, m = map(int, input().split())

numbers = list(map(int, input().split()))

# 0부터 j까지의 값을 미리 합산해서 배열에 저장
pre_sum = [0]

temp = 0
for number in numbers:
    temp += number
    pre_sum.append(temp)

for _ in range(m):
    i, j = map(int, input().split())
    
    result = pre_sum[j] - pre_sum[i - 1]
    print(result)