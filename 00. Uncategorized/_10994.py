from sys import stdout

def draw(size, arg_x, arg_y):
    # 1인 경우 재귀를 종료
    if size == 1:
        board[arg_y][arg_x] = True
        return
    
    for i in range(size):
        board[arg_y][arg_x + i] = True
        board[arg_y + i][arg_x] = True
        board[arg_y + size - 1][arg_x + i] = True
        board[arg_y + i][arg_x + size - 1] = True

    draw(size - 4, arg_x + 2, arg_y + 2)


n = int(input())

size = 1

for _ in range(n - 1):
    size += 4

board = [[False for _ in range(size)] for _ in range(size)]

draw(size, 0, 0)

for row in board:
    for c in row:
        stdout.write("*" if c else " ")
    stdout.write("\n")

stdout.flush()
stdout.close()