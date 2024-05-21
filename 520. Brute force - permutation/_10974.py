n = int(input())

number_list = []

for i in range(1, n + 1):
    number_list.append(i)

# 순열의 첫번째 값 출력
print(" ".join(map(str, number_list)))

# 마지막 순열에 도달할 때 까지 반복
while True:
    target_number = 0
    target_index = 0

    for i in range(n - 1, 0, -1):
        if number_list[i] > number_list[i - 1]:
            target_number = number_list[i - 1]
            target_index = i - 1
            break

    if target_number == 0:
        break

    target_index2 = 0
    for i in range(n - 1, -1, -1):
        if number_list[i] > target_number:
            target_index2 = i
            break

    number_list[target_index] = number_list[target_index2]
    number_list[target_index2] = target_number

    number_list = number_list[:target_index + 1] + sorted(number_list[target_index + 1:])

    print(" ".join(map(str, number_list)))