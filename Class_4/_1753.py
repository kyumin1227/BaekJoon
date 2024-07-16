from sys import stdin

def get_smallest_node():
    index = 0
    min_num = float("inf")
    for i in range(n - 1):
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


input = stdin.readline

n, m = map(int, input().split())

graph = [[] for _ in range(n + 1)]
visited_li = [False] * (n + 1)
distance_li = [float("inf")] * (n + 1)

start = int(input())

for _ in range(m):
    depart, arrive, cost = map(int, input().split())
    graph[depart].append((arrive, cost))

dijkstra(start)

for i in range(1, len(distance_li)):
    if distance_li[i] == float("inf"):
        print("INF")
    else:
        print(distance_li[i])