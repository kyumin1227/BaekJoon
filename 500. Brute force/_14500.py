n, m = map(int, input().split())

number_list = [[0 for _ in range(m + 2)]]

for i in range(n):
    numbers = "0 " + input() + " 0"
    number_list.append(list(map(int, numbers.split())))

number_list.append([0 for _ in range(m + 2)])

max_num = 0

# 두 개의 블럭을 지정하고 근처 최대값 두 개
# 세로 두 개
for x in range(1, m + 1):
    for y in range(1, n):
        num = number_list[y][x] + number_list[y + 1][x]
        number_pool = [number_list[y - 1][x], number_list[y][x - 1], number_list[y][x + 1], number_list[y + 1][x - 1], number_list[y + 1][x + 1], number_list[y + 2][x]]
        num1 = max(number_pool)
        number_pool.remove(num1)
        num2 = max(number_pool)
        num += num1 + num2
        if num > max_num:
            max_num = num

# 가로 두 개
for x in range(1, m):
    for y in range(1, n + 1):
        num = number_list[y][x] + number_list[y][x + 1]
        number_pool = [number_list[y][x - 1], number_list[y - 1][x], number_list[y + 1][x], number_list[y - 1][x + 1], number_list[y + 1][x + 1], number_list[y][x + 2]]
        num1 = max(number_pool)
        number_pool.remove(num1)
        num2 = max(number_pool)
        num += num1 + num2
        if num > max_num:
            max_num = num

# 세 개의 블럭을 지정하고 근처 최대값 하나
# 세로 세 개
for x in range(1, m + 1):
    for y in range(1, n - 2):
        num = number_list[y][x] + number_list[y + 1][x] + number_list[y + 2][x]
        num += max(number_list[y - 1][x], number_list[y][x - 1], number_list[y][x + 1], number_list[y + 1][x - 1], number_list[y + 1][x + 1], number_list[y + 2][x - 1], number_list[y + 2][x + 1], number_list[y + 3][x])
        if num > max_num:
            max_num = num
        
# 가로 세 개
for x in range(1, m - 2):
    for y in range(1, n + 1):
        num = number_list[y][x] + number_list[y][x + 1] + number_list[y][x + 2]
        num += max(number_list[y][x - 1], number_list[y - 1][x], number_list[y + 1][x], number_list[y - 1][x + 1], number_list[y + 1][x + 1], number_list[y - 1][x + 2], number_list[y + 1][x + 2], number_list[y][x + 3])
        if num > max_num:
            max_num = num

print(max_num)