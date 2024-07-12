from collections import deque
from sys import stdin

def bfs(arg_x, arg_y, arg_z, arg_count):
    # 범위를 벗어나는 경우
    if not (0 <= arg_x < m and 0 <= arg_y < n and 0 <= arg_z < h):
        return
    
    # 익은 토마토가 아닌 경우 중에 1이 아닌 경우 제외
    if tomatos_xyz[arg_z][arg_y][arg_x] != 0 and tomatos_xyz[arg_z][arg_y][arg_x] != arg_count:
        return
    
    tomatos_xyz[arg_z][arg_y][arg_x] = arg_count
    
    dz = [0, 0, 0, 0, 1, -1]
    dy = [0, 0, 1, -1, 0, 0]
    dx = [1, -1, 0, 0, 0, 0]

    for i in range(6):
        nx = arg_x + dx[i]
        ny = arg_y + dy[i]
        nz = arg_z + dz[i]

        if (0 <= nx < m and 0 <= ny < n and 0 <= nz < h):
            if tomatos_xyz[nz][ny][nx] == 0:
                queue.append((nx, ny, nz, arg_count + 1))

input = stdin.readline

# 3차원 배열로 받기
m, n, h = map(int, input().rstrip().split())

tomatos_xyz = []

for z in range(h):
    tomatos_xy = []
    for y in range(n):
        tomatos_xy.append(list(map(int, input().rstrip().split())))
    tomatos_xyz.append(tomatos_xy)

queue = deque([])

# 익은 토마토 (1)을 모두 찾아 좌표를 큐에 저장
for z in range(h):
    for y in range(n):
        for x in range(m):
            if tomatos_xyz[z][y][x] == 1:
                queue.append((x, y, z, 1))

# 큐가 빌 때까지 함수를 호출
while len(queue) != 0:
    bfs(*queue.popleft())

# 익지 않은 토마토가 있는지 확인 후 익지 않은 토마토가 없다면 최대값의 - 1 출력
result = 0
for tomatos in tomatos_xyz:
    for row in tomatos:
        for tomato in row:
            if tomato == 0:
                print(-1)
                exit(0)
            if tomato > result:
                result = tomato

print(result - 1)