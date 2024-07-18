import sys
from collections import deque

def bfs():
    # 1부터 계산
    que.append(1)

    while que:
        now = que.popleft()
        for i in graph[now]:
            # 방문한적 없는 경우 parent를 변경하고 que에 추가
            if parent[i] == 0:
                parent[i] = now
                que.append(i)


input = sys.stdin.readline

n = int(input())

graph = [[] for _ in range(n + 1)]
parent = [0] * (n + 1)
que = deque()

# 간선 입력
for _ in range(n - 1):
    node1, node2 = map(int, input().split())
    graph[node1].append(node2)
    graph[node2].append(node1)

bfs()

for i in range(2, n + 1):
    sys.stdout.write(str(parent[i]) + "\n")

sys.stdout.flush()
sys.stdout.close()
