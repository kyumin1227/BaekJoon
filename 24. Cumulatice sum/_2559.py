n, k = map(int, input().split())
number_list = list(map(int, input().split()))

max_sum = sum([number_list[num] for num in range(k)])
num = max_sum
for i in range(n - k):
    num -= number_list[i]
    num += number_list[i + k]
    
    if num > max_sum:
        max_sum = num

print(max_sum)