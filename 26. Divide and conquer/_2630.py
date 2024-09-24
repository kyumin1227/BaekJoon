from collections import deque
from sys import stdin

def check_rect(arg_x, arg_y, arg_size):
    """사각형을 체크하여 단색이면 색을 반환, 단색이 아닌 경우에는 분할하여 que에 저장하는 함수를 호출"""
    temp = 0
    
    for i in range(arg_size):
        temp += sum(datas[arg_y + i][arg_x:arg_x + arg_size])
    
    if temp == 0:
        return 0
    elif temp == arg_size * arg_size:
        return 1
    
    return divide_rect(arg_x, arg_y, arg_size // 2)

def divide_rect(arg_x, arg_y, arg_size):
    """사각형을 분할하여 que에 저장하는 함수"""
    for x, y in ((arg_x, arg_y), (arg_x + arg_size, arg_y), \
    (arg_x, arg_y + arg_size), (arg_x + arg_size, arg_y + arg_size)):
        que.append((x, y, arg_size))


input = stdin.readline
n = int(input())
datas = [list(map(int, input().split())) for _ in range(n)]
white = 0
blue = 0

que = deque()
que.append((0, 0, n))   # 기본값 추가

# que가 빌때까지 반복
while que:
    color = check_rect(*que.popleft())

    if color == 0:
        white += 1
    elif color == 1:
        blue += 1

print(white)
print(blue)