import sys

def clear_star(arg_x, arg_y, arg_size):
    """별이 아닌 부분을 지우는 함수"""
    if arg_size == 1:
        star_board[arg_y - 1][arg_x] = False
        return

    for y in range(arg_size):
        for x in range(-y, y + 1):
            star_board[arg_y - y][arg_x + x] = False

    return clear_star(arg_x - arg_size, arg_y, arg_size // 2), clear_star(arg_x + arg_size, arg_y, arg_size // 2), clear_star(arg_x, arg_y - arg_size, arg_size // 2)

n = int(sys.stdin.readline())

star_board = [[False for _ in range(n * 2 - 1)] for _ in range(n)]

# 삼각형 그리기
for y in range(n):
    star_count = 1 + y * 2
    x_start = n - 1 - y
    for x in range(star_count):
        star_board[y][x_start + x] = True

# 중간 비우기
clear_star(n - 1, n - 1, n // 2)

# 출력
for row in star_board:
    for star in row:
        sys.stdout.write("*" if star else " ")
    sys.stdout.write("\n")

sys.stdout.flush()
sys.stdout.close()
