def backtracking(start_num):
    # 길이를 충족하면 출력
    if len(result_num) == m:
        print(" ".join(map(str, result_num)))
    else:
        # 전달 받은 숫자 부터 시작
        for i in range(start_num, n + 1):
            result_num.append(i)
            backtracking(i + 1)
            result_num.pop()

n, m = map(int, input().split())
result_num = []

# 시작 숫자를 넣고 전달
backtracking(1)