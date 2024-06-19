import sys

# 체크 함수
def check(arg_x, arg_y, arg_num):
    # 가로 세로
    for i in range(9):
        if sdoku[arg_y][i] == arg_num:
            return False
        if sdoku[i][arg_x] == arg_num:
            return False

    # 3 * 3 그룹
    group_x = 0 if arg_x <= 2 else 3 if arg_x <= 5 else 6
    group_y = 0 if arg_y <= 2 else 3 if arg_y <= 5 else 6

    for y in range(group_y, group_y + 3):
        for x in range(group_x, group_x + 3):
            if sdoku[y][x] != 0 and sdoku[y][x] == arg_num:
                return False
        
    return True

def backtracking():
    if len(answer_list) == len(zero_list):
        return
    
    x, y = zero_list[len(answer_list)]
    for num in range(1, 10):    
        if check(x, y, num):
            answer_list.append(num)
            sdoku[y][x] = num
            backtracking()
            # 전체 칸을 채우면 값을 제거하지 않고 리턴
            if len(answer_list) == len(zero_list):
                return
            answer_list.pop()
            sdoku[y][x] = 0


sdoku_input = sys.stdin.readlines()

sdoku = [list(map(int, line.split())) for line in sdoku_input]

zero_list = []  # 0의 위치
answer_list = []    # 현재까지 채운 값

for y in range(9):
    for x in range(9):
        if sdoku[y][x] == 0:
            zero_list.append((x, y))

backtracking()

for line in sdoku:
    print(" ".join(map(str, line)))