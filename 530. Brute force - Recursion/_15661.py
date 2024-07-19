from sys import stdin

def create_team():
    """チームを組む関数 팀을 짜는 함수"""
    # チームの人数  스타트 팀의 인원수
    for i in range(2, n // 2 + 1):
        bruteforce(i, 0)
            
def bruteforce(arg_team_len, arg_index):
    # チームの組が終わった場合  팀 짜기가 끝난 경우
    if len(start_team) == arg_team_len:
        claculate_stats()
        link_team.clear()
        return

    for i in range(arg_index, min(n, n - arg_team_len + arg_index)):
        if i not in start_team:
            start_team.append(i)
            bruteforce(arg_team_len, i + 1)
            start_team.pop()

def claculate_stats():
    """能力値を計算 능력치 계산"""

    # link_teamを組む   링크 팀 결성
    for i in range(n):
        if i not in start_team:
            link_team.append(i)
    
    # start 팀 능력치 계산
    start_stats = 0

    for i in start_team:
        for j in start_team:
            start_stats += board[i][j]

    # link 팀 능력치 계산
    link_stats = 0

    for i in link_team:
        for j in link_team:
            link_stats += board[i][j]

    # 능력치 비교
    compare = max(start_stats, link_stats) - min(start_stats, link_stats)
    global result

    if compare < result:
        result = compare


input = stdin.readline
start_team = []
link_team = []
board = []
result = float("inf")

n = int(input())

for _ in range(n):
    board.append(list(map(int, input().split())))

create_team()

print(result)