import sys
import heapq

def dijkstra():
    distance_li[1] = 0
    heapq.heappush(heap, (0, 1))    # 시작 도시는 1 고정
    
    while heap:
        now_distance, now_node = heapq.heappop(heap)

        # 이미 방문하여 최단 거리가 갱신된 노드면 스킵
        if distance_li[now_node] < now_distance:
            continue
        
        # 최단 거리가 갱신 되면 힙에 추가
        for line in graph[now_node]:
            if distance_li[line[0]] > now_distance + line[1]:
                distance_li[line[0]] = now_distance + line[1]
                heapq.heappush(heap, (now_distance + line[1], line[0]))


input = sys.stdin.readline

n, m = map(int, input().split())

graph = [[] for _ in range(n + 1)]
distance_li = [float("inf")] * (n + 1)
heap = []

# 양쪽으로 연결
for _ in range(m):
    depart, arrive, cost = map(int, input().split())
    graph[depart].append((arrive, cost))
    graph[arrive].append((depart, cost))

dijkstra()

print(distance_li[n])
