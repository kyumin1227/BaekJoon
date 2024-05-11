def backtracking():
    if len(result_num) == m:
        print(" ".join(map(str, result_num)))
    else:
        for i in range(1, n + 1):
            result_num.append(i)
            backtracking()
            result_num.pop()

n, m = map(int, input().split())
result_num = []
backtracking()