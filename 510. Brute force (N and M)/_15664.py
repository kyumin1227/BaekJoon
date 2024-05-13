def backtracking(start_index):
    if len(result_number) == m:
        print(" ".join(map(str, result_number)))
    else:
        for i in range(start_index, n):
            # 출력한 숫자면 스킵
            if numbers[i] in log_number[len(result_number)]:
                continue
            # 다른 인덱스에서 사용한 인덱스면 스킵
            if i in result_index:
                continue
            log_number[len(result_number)].append(numbers[i])
            result_number.append(numbers[i])
            result_index.append(i)
            backtracking(i + 1)
            result_number.pop()
            result_index.pop()
        
        log_number[len(result_number)].clear()  # 해당하는 인덱스의 출력한 숫자 초기화

n, m = map(int, input().split())
numbers = list(map(int, input().split()))
numbers.sort()

result_number = []  # 출력할 숫자
result_index = []   # 출력할 숫자의 인덱스
log_number = [[] for _ in range(m)] # 이미 출력한 숫자 모음

backtracking(0)