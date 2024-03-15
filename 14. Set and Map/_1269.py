a, b = map(int, input().split())

arr_a = set(input().split())
arr_b = set(input().split())

# print(len((arr_a - arr_b) | (arr_b - arr_a)))
print(len(arr_a ^ arr_b))