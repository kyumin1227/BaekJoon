import sys

input = sys.stdin.readline

n, m = map(int, input().split())    # n = 노드 개수, m = 간선 개수
start = int(input())    # 출발 노드

graph = [[] for _ in range(n + 1)]
visited = [False] * (n + 1) # 방문 기록
distance = [float("inf")] * (n + 1) # 거리 기록

for _ in range(m):
    a, b, c = map(int, input().split())
    graph[a].append((b, c))

# 방문하지 않은 노드 중 시작 노드와 최단거리인 노드 반환
def get_samllest_node():
    min_value = float("inf")
    index = 0
    for i in range(1, n + 1):
        if not visited[i] and distance[i] < min_value:
            min_value = distance[i]
            index = i
    return index

def dijkstra(start):
    # 시작 노드 거리 계산 및 방문 처리
    distance[start] = 0
    visited[start] = True

    # 시작 노드의 인접한 노드들에 대해 최단거리 계산
    for i in graph[start]:
        distance[i[0]] = i[1]

    for _ in range(n - 1):
        now = get_samllest_node()
        visited[now] = True

        for next in graph[now]:
            cost = distance[now] + next[1]
            if cost < distance[next[0]]:
                distance[next[0]] = cost

dijkstra(start)

for i in range(1, n + 1):
    if distance[i] == float("inf"):
        print("도달 할 수 없음")
    else:
        print(distance[i])