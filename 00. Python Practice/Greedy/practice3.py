n = int(input())
number_list = list(map(int, input().split()))

number_list.sort()

result = 0
count = 0

for i in range(n):
    count += 1
    if number_list[i] <= count:
        count = 0
        result += 1

print(result)