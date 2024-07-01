from sys import setrecursionlimit
setrecursionlimit(10**9)

def star(arg_size, arg_now_size, arg_target_x = 0, arg_target_y = 0):
    """재귀적으로 별이 아닌 부분을 체크하는 함수 (전체 사이즈, 현재 사이즈, 시작 x, 시작 y)"""
    # 현재 사이즈가 1에 도달하면 종료
    if arg_now_size == 1:
        return
    
    check_x = arg_target_x + arg_now_size // 3
    check_y = arg_target_y + arg_now_size // 3
    
    # 체크할 부분을 확인하여 체크
    for x in range(check_x, check_x + arg_now_size // 3):
        for y in range(check_y, check_y + arg_now_size // 3):
            star_list[y][x] = False
    
    # 현재 사이즈의 마지막 위치에 도달 시 다음 사이즈 호출
    if arg_target_x + arg_now_size == arg_size and arg_target_y + arg_now_size == arg_size:
        return star(arg_size, arg_now_size // 3)
    
    # x의 마지막 위치에 도달 시 x는 0, y는 추가
    if arg_target_x + arg_now_size < arg_size:
        return star(arg_size, arg_now_size, arg_target_x + arg_now_size, arg_target_y)
    else:
        return star(arg_size, arg_now_size, 0, arg_target_y + arg_now_size)
        

n = int(input())

star_list = [[True for _ in range(n)] for _ in range(n)]    # 별을 체크할 리스트

star(n, n)

# 출력
for line in star_list:
    for b in line:
        print("*" if b == True else " ", end="")
    print()