from collections import deque

def bfs():
    while que:
        now_x, now_y, now_day = que.popleft()

        # 범위를 벗어난 경우 또는 0이 아닌 경우 제외 하지만 처음 1인 값은 제외
        if (not (0 <= now_x < m and 0 <= now_y < n) or board[now_y][now_x] != 0)\
            and now_day != 1:
            continue

        board[now_y][now_x] = now_day
        
        dx = [1, -1, 0, 0]
        dy = [0, 0, 1, -1]

        for i in range(4):
            que.append((now_x + dx[i], now_y + dy[i], now_day + 1))


m, n = map(int, input().split())

board = []

for _ in range(n):
    temp = list(map(int, input().split()))
    board.append(temp)

que = deque()

# 초기값이 1인 경우 que에 추가
for x in range(m):
    for y in range(n):
        if board[y][x] == 1:
            que.append((x, y, 1))

bfs()

# 결과 계산
max_day = 0

for line in board:
    for t in line:
        if t == 0:
            print(-1)
            exit()
        if t > max_day:
            max_day = t

print(max_day - 1)