# 가로는 반드시 모두 차지하기에 한 줄에는 한번씩만 값을 추가

def changeBoard(arg_x, arg_y, arg_z, arg_bool):
    target_list[arg_x][arg_y][arg_z] = arg_bool

    for i in range(n):
        target_list[i][arg_y][arg_z] = arg_bool
    
    i = 1
    while arg_x + i < n and arg_y + i < n:
        target_list[arg_x + i][arg_y + i][arg_z] = arg_bool
        i += 1

    i = 1
    while arg_x + i < n and arg_y - i >= 0:
        target_list[arg_x + i][arg_y - i][arg_z] = arg_bool
        i += 1


def backtracking(arg_x, arg_y, arg_z):
    changeBoard(arg_x, arg_y, arg_z, True)
    global result
    index = len(queen_list)
    if index == n:
        result += 1
        return

    for j in range(n):
        isEmpty = True
        for target in target_list[index][j]:
            if target != False:
                isEmpty = False
                break
        if isEmpty:
            queen_list.append((index, j))
            backtracking(index, j, arg_z + 1)
            changeBoard(*queen_list.pop(), len(queen_list), False)


n = int(input())

target_list = [[[False for _ in range(n)] for _ in range(n)] for _ in range(n)]
queen_list = []
result = 0

for i in range(n):
    queen_list.append((0, i))
    backtracking(0, i, 0)
    changeBoard(*queen_list.pop(), 0, False)

print(result)