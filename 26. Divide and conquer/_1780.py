from sys import stdin

def check_rect(arg_x, arg_y, arg_size):
    """사각형을 검사하여 하나의 숫자로만 이루어져있는지 확인하는 함수"""
    # -1, 0, 1 에 해당하는 경우 결과에 추가

    first_value = datas[arg_y][arg_x]

    for i in range(arg_size):
        for j in range(arg_size):
            if first_value != datas[arg_y + i][arg_x + j]:
                divide_rect(arg_x, arg_y, arg_size // 3)
                return

    global result
    result[first_value + 1] += 1

def divide_rect(arg_x, arg_y, arg_size):
    """사각형을 9등분 하여 chaek 하는 함수"""
    for i in range(9):
        check_rect(arg_x + (i % 3 * arg_size), arg_y + (i // 3 * arg_size), arg_size)


input = stdin.readline
n = int(input())
datas = [tuple(map(int, input().split())) for _ in range(n)]
result = [0] * 4    # 0: -1, 1: 0, 2: 1

check_rect(0, 0, n)

for i in range(3):
    print(result[i])