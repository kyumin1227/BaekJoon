def dfs(x, y, count):
    if x <= -1 or x >= n or y <= -1 or y >= m:
        return 40000
    count += 1
    if x == n - 1 and y == m - 1:
        return count
    tmp = []
    if graph[x][y] == 1:
        graph[x][y] = 0
        tmp.append(dfs(x + 1, y, count))
        tmp.append(dfs(x - 1, y, count))
        tmp.append(dfs(x, y + 1, count))
        tmp.append(dfs(x, y - 1, count))
        return min(tmp)
    return 40000

n, m = map(int, input().split())

graph = []
for _ in range(n):
    graph.append(list(map(int, input())))

print(dfs(0, 0, 0))