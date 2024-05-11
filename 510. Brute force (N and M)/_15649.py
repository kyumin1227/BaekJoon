def backtracking():
    # 정답이면 출력
    if len(result_num) == m:
        print(" ".join(map(str, result_num)))
    # 아닌 경우 값을 더함
    else:
        for i in range(1, n + 1):
            # 해당 숫자가 결과 리스트에 없으면 값을 추가 후 함수 재호출
            if i not in result_num:
                result_num.append(i)
                backtracking()
                result_num.pop()

n, m = map(int, input().split())
result_num = []

backtracking()