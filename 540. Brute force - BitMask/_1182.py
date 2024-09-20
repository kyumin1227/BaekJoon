def backtracking(arg_index):
    global temp
    if temp == s and arg_index != 0:
        global result
        result += 1

    for i in range(arg_index, n):
        temp += datas[i]
        backtracking(i + 1)
        temp -= datas[i]
    

n, s = map(int, input().split())
datas = tuple(map(int, input().split()))
result = 0
temp = 0

backtracking(0)

print(result)
