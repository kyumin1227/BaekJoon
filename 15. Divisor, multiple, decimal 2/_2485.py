import sys
from math import gcd

n = int(sys.stdin.readline().rstrip())

start_num = int(sys.stdin.readline().rstrip())

arr = []

target_num = int(sys.stdin.readline().rstrip())

arr.append(target_num - start_num)

for i in range(n - 2):
    input_num = int(sys.stdin.readline().rstrip())
    arr.append(input_num - target_num)
    target_num = input_num

g = arr[0]

for i in range(1, len(arr)):
    g = gcd(g, arr[i])

result = 0
for num in arr:
    result += num // g - 1

print(result)