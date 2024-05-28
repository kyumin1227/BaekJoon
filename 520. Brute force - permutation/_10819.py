def cal(args_list):
    sum = 0
    for i in range(n - 1):
        result = args_list[i] - args_list[i + 1]
        if result > 0:
            sum += result
        else:
            sum += -result

    return sum

n = int(input())

numbers = list(map(int, input().split()))
numbers_permutation = [i for i in range(n)]
numbers_cal = [numbers[i] for i in range(n)]

sum_max = cal(numbers_cal)

while True:
    target_index = -1
    for i in range(-1, -n, -1):
        if numbers_permutation[i] > numbers_permutation[i - 1]:
            target_index = i - 1
            break

    if target_index == -1:
        break

    target_number = numbers_permutation[target_index]
    for i in range(-1, -n, -1):
        if numbers_permutation[i] > target_number:
            numbers_permutation[target_index] = numbers_permutation[i]
            numbers_permutation[i] = target_number
            break

    numbers_permutation = numbers_permutation[:target_index + 1] + sorted(numbers_permutation[target_index + 1:])
    numbers_cal = [numbers[i] for i in numbers_permutation]
    sum = cal(numbers_cal)

    if sum_max < sum:
        sum_max = sum

print(sum_max)