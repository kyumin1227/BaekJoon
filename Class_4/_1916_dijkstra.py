from sys import stdin

def get_small_cost():
    """가장 비용이 적게 드는 노드를 가져오는 함수"""
    min_num = float("inf")
    index = 0

    for i in range(1, n + 1):
        if not visited_li[i] and cost_li[i] < min_num:
            min_num = cost_li[i]
            index = i

    return index

def dijkstra(arg_start):

    # 스타트 계산
    cost_li[arg_start] = 0
    visited_li[arg_start] = True
    for i in graph[arg_start]:
        if cost_li[i[0]] > i[1]:
            cost_li[i[0]] = i[1]

    for _ in range(n - 1):
        now = get_small_cost()
        visited_li[now] = True
        for i in graph[now]:
            if cost_li[i[0]] > cost_li[now] + i[1]:
                cost_li[i[0]] = cost_li[now] + i[1]


input = stdin.readline

n = int(input())
m = int(input())

graph = [[] for _ in range(n + 1)]
visited_li = [False] * (n + 1)
cost_li = [float("inf")] * (n + 1)

for _ in range(m):
    depart, arrive, cost = map(int, input().split())
    graph[depart].append((arrive, cost))

start, end = map(int, input().split())

dijkstra(start)

print(cost_li[end])