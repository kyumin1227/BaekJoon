n = int(input())
input_numbers = list(map(int, input().split()))

# 처음으로 앞의 수가 뒤의 수보다 작은 인덱스를 찾음
target_index = 0
target_number = 0
for i in range(n - 1, 0, -1):
    if input_numbers[i] > input_numbers[i - 1]:
        target_index = i - 1
        target_number = input_numbers[i - 1]
        break

# 만약에 해당 수를 찾지 못하였으면 마지막 리스트이므로 -1을 출력 후 종료
if target_number == 0:
    print(-1)
    exit()

# 아까 찾은 수 보다 큰 수를 뒤에서 부터 찾음
target_index2 = 0
for i in range(n - 1, -1, -1):
    if input_numbers[i] > target_number:
        target_index2 = i
        break

# 찾은 두 개의 수 자리 변경 후 정렬
input_numbers[target_index] = input_numbers[target_index2]
input_numbers[target_index2] = target_number

input_numbers = input_numbers[:target_index + 1] + sorted(input_numbers[target_index + 1:])
print(" ".join(map(str, input_numbers)))