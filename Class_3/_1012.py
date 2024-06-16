# DFS

import sys

# 재귀 최대 깊이 변경
sys.setrecursionlimit(10**6)

def check(arg_x, arg_y, arg_array):
    if arg_x < 0 or arg_y < 0 or arg_x >= len(arg_array[0]) or arg_y >= len(arg_array) or arg_array[arg_y][arg_x] == False:
        return 0
    
    arg_array[arg_y][arg_x] = False
    
    check(arg_x + 1, arg_y, arg_array)
    check(arg_x - 1, arg_y, arg_array)
    check(arg_x, arg_y + 1, arg_array)
    check(arg_x, arg_y - 1, arg_array)

    return 1
    

t = int(sys.stdin.readline().rstrip())

input_case = sys.stdin.readlines()

index = 0
for i in range(t):
    x, y, k = map(int, input_case[index].split())

    result = 0

    # 배열 생성
    target_array = [[False for _ in range(x)] for _ in range(y)]

    # 배열 내의 타켓 위치 체크
    for j in range(k):
        target_x, target_y = map(int, input_case[index + j + 1].split())
        target_array[target_y][target_x] = True

    # 깊이 탐색을 통해 결과 값 구함
    for y_index in range(y):
        for x_index in range(x):
            result += check(x_index, y_index, target_array)

    print(result)

    index += k + 1