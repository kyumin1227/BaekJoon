def backtracking(start_index):
    if len(result_num) == m:
        print(" ".join(map(str, result_num)))
    else:
        for i in range(start_index, len(numbers)):
            result_num.append(numbers[i])
            backtracking(i + 1)
            result_num.pop()

n, m = map(int, input().split())
numbers = list(map(int, input().split()))
numbers.sort()
result_num = []

backtracking(0)