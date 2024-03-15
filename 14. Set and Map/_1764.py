n, m = map(int, input().split())

set1 = set()
set2 = set()

for i in range(n):
    set1.add(input())

for i in range(m):
    set2.add(input())

result = set1 & set2

print(len(result))

result_array = list(result)

result_array.sort()

for i in result_array:
    print(i)
