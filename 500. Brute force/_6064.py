import sys
input = sys.stdin.readline
t = int(input())

for i in range(t):
    m, n, x, y = map(int, input().split())

    year = x
    result = False  # 년도를 나타낼 수 있는 경우
    repeat = False  # 한바퀴 돌았는지 체크를 위한 변수

    temp_m = x
    temp_n = x

    default_n = x

    while default_n > n:
            default_n -= n
    
    while True:
        while temp_n > n:
            temp_n -= n
        # 한바퀴 돌고 제자리로 돌아오면 종료
        if temp_m == x and temp_n == default_n and repeat:
            break
        # 처음에 체크
        if temp_m == x and temp_n == default_n:
            repeat = True

        if temp_m == x and temp_n == y:
            result = True
            break

        temp_n += m
        year += m

    if result:
        print(year)
    else:
        print(-1)