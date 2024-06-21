import sys

def cal_backtracking(arg_list, arg_team):
    global start_team
    global link_team
    for i in arg_list:
        for j in arg_list:
            if arg_team == 0:
                start_team += board[i][j]
            else:
                link_team += board[i][j]

# 차이가 0이 나오기 전까지 모든 경우의 수로 팀을 나눔
def backtracking(arg_start):
    global dif
    # 팀을 짜고 나면 능력치 계산
    if len(start_team_list) * 2 == n:
        # print(start_team_list)
        global start_team
        global link_team

        start_team = 0
        link_team = 0

        link_team_list = []

        cal_backtracking(start_team_list, 0)
        for i in [i for i in range(n)]:
            if i not in start_team_list:
                link_team_list.append(i)
        cal_backtracking(link_team_list, 1)

        if dif > abs(start_team - link_team):
            dif = abs(start_team - link_team)
        
        return
    
    # 차이가 0이면 종료
    if dif == 0:
        print(0)
        exit()

    if arg_start == 0:
        start_team_list.append(0)
        backtracking(1)
    else:
        for i in range(arg_start, n):
            start_team_list.append(i)
            backtracking(i + 1)
            start_team_list.pop()
        
        
n = int(input())

board = [list(map(int, line.split())) for line in sys.stdin.readlines()]

start_team_list = []
cal_list = []
start_team = 0
link_team = 0

dif = float("inf")  # 양 팀의 차이값

backtracking(0)

print(dif)