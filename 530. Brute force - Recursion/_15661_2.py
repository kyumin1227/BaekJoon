from sys import stdin

def claculate_stats():
    """能力値を計算 능력치 계산"""
    start_team = target.pop()

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
    compare = abs(start_stats - link_stats)
    global result

    result = min(result, compare)

    link_team.clear()

def bruteforce(arg_index, arg_count):
    # 모든 경우의 수의 절반을 생성
    if len(target_team) == arg_count:
        target.append(target_team[:])
        return
    
    for i in range(arg_index, n):
        if i not in target_team:
            target_team.append(i)
            bruteforce(i + 1, arg_count)
            target_team.pop()


input = stdin.readline
start_team = []
link_team = []
board = []
result = float("inf")

n = int(input())

for _ in range(n):
    board.append(list(map(int, input().split())))

target = []
target_team = []

for i in range(1, n // 2 + 1):
    bruteforce(0, i)

while target:
    claculate_stats()

print(result)
