import sys

def draw_triangle(arg_x, arg_y, arg_line, arg_direction):
    """별을 그리고 라인이 남았을 경우 재귀를 통해 별을 추가로 그림"""
    # arg_direction = 별의 방향을 표시 윗 별: 0, 왼쪽 아래: 1, 오른쪽 아래: 2

    # 만약 이미 True로 변경된 곳에 추가로 호출이 되면 False로 변경
    change = True
    if star_background[arg_y][arg_x] == True:
        change = False
    
    # 별 그리기
    star_background[arg_y][arg_x] = change
    
    star_background[arg_y + 1][arg_x - 1] = change
    star_background[arg_y + 1][arg_x + 1] = change

    for i in range(-2, 3):
        star_background[arg_y + 2][arg_x + i] = change

    # line이 남은 경우 추가 호출
    if arg_direction == 0 and arg_line > 1:
        arg_line -= 1
        draw_triangle(arg_x - 3, arg_y + 3, arg_line, 1)
        draw_triangle(arg_x + 3, arg_y + 3, arg_line, 2)
    elif arg_line > 1:
        arg_line -= 1
        if arg_direction == 1:
            draw_triangle(arg_x - 3, arg_y + 3, arg_line, 0)
        elif arg_direction == 2:
            draw_triangle(arg_x + 3, arg_y + 3, arg_line, 0)


n = int(input())

star_background = [[False for _ in range(n * 2)] for _ in range(n)]

# 몇 제곱인지 계산
k = 0
while n // 3 != 2 ** k:
    k += 1

star_line = 2 ** k

draw_triangle(n - 1, 0, star_line, 0)

for row in star_background:
    for star in row:
        sys.stdout.write("*" if star else " ")
    sys.stdout.write("\n")

sys.stdout.flush()
sys.stdout.close()
