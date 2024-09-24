from collections import deque
from sys import stdin

def check_rect(arg_x, arg_y, arg_size):
    """사각형을 검사하여 하나의 숫자로만 이루어져있는지 확인하는 함수"""
    # 반환값
    # -1로만 이루어진 경우 0
    # 0으로만 이루어진 경우 1
    # 1로만 이루어진 경우 2
    # 분할할 필요가 있는 경우 3

    temp = 0
    isZero = True
    for i in range(arg_size):
        for j in range(arg_size):
            temp += datas[arg_y + i][arg_x + j]
            if temp != 0:
                isZero = False

    if temp == -arg_size * arg_size:
        return 0
    elif temp == 0 and isZero:
        return 1
    elif temp == arg_size * arg_size:
        return 2
    
    divide_rect(arg_x, arg_y, arg_size // 3)
    return 3

def divide_rect(arg_x, arg_y, arg_size):
    """사각형을 9등분 하여 que에 추가하는 함수"""
    for i in range(9):
        que.append((arg_x + i % 3 * arg_size, arg_y + i // 3 * arg_size, arg_size))


input = stdin.readline
n = int(input())
datas = [list(map(int, input().split())) for _ in range(n)]
result = [0] * 4

que = deque()
que.append((0, 0, n))   # 기본값 추가

while que:
    # que에서 뺀 값을 함수에 넣고 반환값에 따라 결과값 추가
    result[check_rect(*que.popleft())] += 1

for i in range(3):
    print(result[i])