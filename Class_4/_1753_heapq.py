import sys
import heapq

def dijkstra(start):
    distance_li[start] = 0
    heapq.heappush(heap, (0, start))

    while heap:
        now_distance, now_node = heapq.heappop(heap)
        
        # 이미 처리된 노드라면 무시
        if distance_li[now_node] < now_distance:
            continue

        for line in graph[now_node]:
            distance = now_distance + line[1]

            # 최단 거리가 변경 될 경우 갱신 후 힙에 추가
            if distance < distance_li[line[0]]:
                distance_li[line[0]] = distance
                heapq.heappush(heap, (distance, line[0]))


input = sys.stdin.readline

n, m = map(int, input().split())
start = int(input())

graph = [[] for _ in range(n + 1)]
distance_li = [float("inf")] * (n + 1)
heap = []


for i in range(m):
    depart, arrive, cost = map(int, input().split())
    graph[depart].append((arrive, cost))

dijkstra(start)

for i in range(1, n + 1):
    if distance_li[i] == float("inf"):
        sys.stdout.write("INF\n")
    else:
        sys.stdout.write(str(distance_li[i]) + "\n")

sys.stdout.flush()
sys.stdout.close()