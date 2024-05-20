n = int(input())
input_list = list(map(int, input().split()))

# 처음으로 오르는 i를 찾았을 때
target_index = 0
target_number = 0
for i in range(len(input_list) - 1, 0, -1):
    if input_list[i] < input_list[i - 1]:
        target_index = i - 1
        target_number = input_list[i - 1]
        break

# 없는 경우 종료
if target_number == 0:
    print(-1)
    exit()

# 뒤에서 부터 확인해서 해당 수 보다 작은 수를 찾으면 앞으로 보내고 내림차 정렬
target_index2 = 0
for i in range(len(input_list) - 1, 0, -1):
    if input_list[i] < target_number:
        target_index2 = i
        break

input_list[target_index] = input_list[target_index2]
input_list[target_index2] = target_number

result_list = input_list[: target_index + 1] + sorted(input_list[target_index + 1 :], reverse=True)
print(" ".join(map(str, result_list)))