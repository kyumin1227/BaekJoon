from collections import deque

n, k = map(int, input().split())

board = [-1 for _ in range(100001)]

que = deque()

que.append(n)

while que:
    x = que.popleft()
    
    # 동생이 있는 위치에 도착하면 출력 후 종료
    if x == k:
        print(board[k] + 1)
        exit()

    # 갈 수 있는 위치 que에 추가
    for nx in (x + 1, x - 1, x * 2):
        if 0 <= nx < 100001 and board[nx] == -1:
            board[nx] = board[x] + 1
            que.append(nx)
