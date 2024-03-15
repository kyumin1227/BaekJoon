N, M = map(int, input().split())

arr = set()

for i in range(N):
    arr.add(input())

result = 0

for i in range(M):
    if input() in arr:
        result += 1

print(result)