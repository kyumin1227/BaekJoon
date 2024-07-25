from sys import stdout

def draw(size_x, size_y , arg_x, arg_y):
    # 사이즈가 1인 경우
    if size_x == 1:
        for i in range(size_y):
            board[arg_y + i][arg_x] = True
        return

    # 속이 비어있는 네모
    for i in range(size_y):
        board[arg_y][min(arg_x + i, arg_x + size_x - 1)] = True
        board[arg_y + i][arg_x] = True
        board[arg_y + size_y - 1][min(arg_x + i, arg_x + size_x - 1)] = True
        board[arg_y + i][arg_x + size_x - 1] = True

    # 보정
    board[arg_y + 1][arg_x + size_x - 1] = False
    board[arg_y + 2][arg_x + size_x - 2] = True
    
    draw(size_x - 4, size_y - 4, arg_x + 2, arg_y + 2)

n = int(input())

# n이 1인 경우
if n == 1:
    print("*")
    exit()

size = 1

for _ in range(n - 1):
    size += 4

board = [[False for _ in range(size)] for _ in range(size + 2)]

draw(size, size + 2, 0, 0)

for row in board:
    s = ""
    for c in row:
        s += "*" if c else " "
    stdout.write(s.rstrip() + "\n")

stdout.flush()
stdout.close()
