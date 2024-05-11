def backtracking(start_num):
    if len(result_num) == m:
        print(" ".join(map(str, result_num)))
    else:
        for i in range(start_num, n + 1):
            result_num.append(i)
            backtracking(i)
            result_num.pop()

n, m = map(int, input().split())
result_num = []
backtracking(1)