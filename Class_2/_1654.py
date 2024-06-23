from sys import stdin

k, n = map(int, input().split())

lines = list(map(int, stdin.readlines()))

high = max(lines)
low = 0
result = 0

# high가 low 보다 작아질 때 까지 반복
while low <= high:
    count = 0
    mid = (high + low) // 2
    if mid == 0:
        mid = 1
    for line in lines:
        count += line // mid

    if count >= n:
        result = mid
        low = mid + 1
    elif count < n:
        high = mid - 1

print(result)