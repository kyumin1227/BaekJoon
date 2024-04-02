import sys

input = sys.stdin.readline

number_list = list()
sum = 0

# 수 받기
for i in range(9):
    num = int(input())
    number_list.append(num)
    sum += num

target_number = sum - 100
end_check = False

# 두 수를 합쳐서 전체 합에서 100을 뺀 값이 될 경우 해당 두 수를 제거
for i in range(9):
    if end_check:
        break
    for j in range(9):
        if number_list[i] + number_list[j] == target_number and i != j:
            target1 = number_list[i]
            target2 = number_list[j]
            number_list.remove(target1)
            number_list.remove(target2)
            end_check = True
            break

# 두 수를 제거한 배열을 정렬 후 출력
number_list.sort()
for num in number_list:
    sys.stdout.write(str(num) + "\n")