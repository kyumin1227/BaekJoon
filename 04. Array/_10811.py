import math

n, m = map(int, input().split())

result_list = [i for i in range(1, n + 1)]

for i in range(m):
    num_start, num_end = map(int, input().split())

    for j in range(math.ceil((num_end - num_start) / 2)):
        num_temp = result_list[num_start - 1 + j]
        result_list[num_start - 1 + j] = result_list[num_end - 1 - j]
        result_list[num_end - 1 - j] = num_temp

for num in result_list:
    print(num, end=" ")
        