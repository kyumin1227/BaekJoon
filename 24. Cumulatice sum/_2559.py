n, k = map(int, input().split())
number_list = list(map(int, input().split()))

max_sum = -float("inf")
for i in range(n - k + 1):
    num = 0
    for j in range(i, i + k):
        num += number_list[j]
    
    if num > max_sum:
        max_sum = num

print(max_sum)