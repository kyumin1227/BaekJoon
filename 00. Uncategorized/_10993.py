from sys import stdout

def draw(arg_size, arg_x, arg_y, arg_size_x, arg_size_y):
    # size가 1인 경우
    if arg_size == 1:
        board[arg_y][arg_x] = True
        return
    
    # 짝수인 경우 삼각형을 아래로 그림
    if arg_size % 2 == 0:
        for i in range(arg_size_x):
            board[arg_y][arg_x + i] = True
        for i in range(1, arg_size_y):
            board[arg_y + i][arg_x + i] = True
            board[arg_y + i][arg_x + arg_size_x - 1 - i] = True
        draw(arg_size - 1, arg_x + (arg_size_x // 4) + 1, arg_y + (arg_size_y // 2), (arg_size_x - 1) // 2 - 1, (arg_size_y - 1) // 2)

    # 홀수인 경우 삼각형을 위로 그림
    else:
        for i in range(arg_size_x):
            board[arg_y][arg_x + i] = True
        for i in range(1, arg_size_y):
            board[arg_y - i][arg_x + i] = True
            board[arg_y - i][arg_x + arg_size_x - 1 - i] = True
        draw(arg_size - 1, arg_x + (arg_size_x // 4) + 1, arg_y - (arg_size_y // 2), (arg_size_x - 1) // 2 - 1, (arg_size_y - 1) // 2)
        

n = int(input())

x = 1
y = 1

for _ in range(n - 1):
    x += 1
    x *= 2
    x += 1

    y *= 2
    y += 1

board = [[False for _ in range(x)] for _ in range(y)]

if n % 2 == 0:
    draw(n, 0, 0, x, y)
else:
    draw(n, 0, y - 1, x, y)

for raw in board:
    s = ""
    for c in raw:
        s += "*" if c == True else " "
    # 공백 제거 후 출력
    s = s.rstrip()
    stdout.write(s + "\n")

stdout.flush()
stdout.close()