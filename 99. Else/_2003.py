n, m = map(int, input().split())
numbers = list(map(int, input().split()))

i = 0
j = 0
sum_number = 0
result = 0

while True:
    
    # 더한 값이 m과 같으면 결과를 1 상승
    if sum_number == m:
        result += 1

    # 더한 값이 m 보다 크면 i인덱스의 수를 빼고 i를 상승
    if sum_number > m:
        sum_number -= numbers[i]
        i += 1
    # 더한 값이 m 보다 크지 않고 j가 리스트의 끝에 도달하면 종료
    elif j == len(numbers):
        break
    # 더한 값이 m 보다 작으면 j인덱스의 수를 더하고 j를 상승
    else:
        sum_number += numbers[j]
        j += 1

print(result)