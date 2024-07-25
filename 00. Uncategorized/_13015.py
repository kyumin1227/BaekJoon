def check_center(size, arg_x, arg_y):
    
    for i in range(size):

        # 중앙에서 4방향
        board[arg_y + i][arg_x + i] = True
        board[arg_y + i][arg_x - i] = True
        board[arg_y - i][arg_x + i] = True
        board[arg_y - i][arg_x - i] = True

        # 중앙 + n - 2 또는 중앙 - n - 2에 아래 위 2 방향
        board[arg_y + i][arg_x + i + n - 1] = True
        board[arg_y - i][arg_x + i + n - 1] = True
        board[arg_y + i][arg_x - i - n + 1] = True
        board[arg_y - i][arg_x - i - n + 1] = True

    # 끝쪽 채우기
    for i in range(1, size - 1):
        board[arg_y + (size - 1)][arg_x + (size - 1) + i] = True
        board[arg_y - (size - 1)][arg_x + (size - 1) + i] = True
        board[arg_y + (size - 1)][arg_x - (size - 1) - i] = True
        board[arg_y - (size - 1)][arg_x - (size - 1) - i] = True
        

n = int(input())

x = (n - 1) * 4 + 1
y = n * 2 - 1

board = [[False for _ in range(x)] for _ in range(y)]

check_center(n, x // 2, y // 2)

for row in board:
    s = ""
    for c in row:
        s += "*" if c else " "
    print(s.rstrip())
