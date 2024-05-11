def backtracking():
    if len(result_num) == m:
        print(" ".join(map(str, result_num)))
    else:
        for num in numbers:
            result_num.append(num)
            backtracking()
            result_num.pop()

n, m = map(int, input().split())
numbers = list(map(int, input().split()))
numbers.sort()
result_num = []

backtracking()