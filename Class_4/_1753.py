import sys

def get_smallest_node():
    """값이 가장 작은 노드 가져오는 함수"""
    index = 0
    min_num = float("inf")
    for i in range(1, n + 1):
        if not visited_li[i] and min_num > distance_li[i]:
            min_num = distance_li[i]
            index = i
    
    return index

def dijkstra(start):
    visited_li[start] = True
    distance_li[start] = 0
    for i in graph[start]:
        if i[1] < distance_li[i[0]]:
            distance_li[i[0]] = i[1]

    for _ in range(n - 1):
        now = get_smallest_node()
        visited_li[now] = True
        for i in graph[now]:
            if distance_li[i[0]] > distance_li[now] + i[1]:
                distance_li[i[0]] = distance_li[now] + i[1]


input = sys.stdin.readline

n, m = map(int, input().split())

graph = [[] for _ in range(n + 1)]
visited_li = [False] * (n + 1)
distance_li = [float("inf")] * (n + 1)

start = int(input())

for _ in range(m):
    depart, arrive, cost = map(int, input().split())
    graph[depart].append((arrive, cost))

dijkstra(start)

for i in range(1, n + 1):
    if distance_li[i] == float("inf"):
        sys.stdout.write("INF\n")
    else:
        sys.stdout.write(f"{distance_li[i]}\n")

sys.stdout.flush()
sys.stdout.close()