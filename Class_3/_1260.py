from sys import stdin
from collections import deque

n, m, v = map(int, stdin.readline().split())

def dfs(arg_num):
    dfs_li.append(arg_num)
    graph[arg_num].sort()
    for num in graph[arg_num]:
        if num not in dfs_li:
            dfs(num)
    return


def bfs(arg_num):
    que = deque()

    que.append(arg_num)

    while que:
        target_num = que.popleft()
        bfs_li.append(target_num)
        target = sorted(graph[target_num])
        for num in target:
            if num not in bfs_li and num not in que:
                que.append(num)


graph = [[] for _ in range(n + 1)]

for _ in range(m):
    num1, num2 = map(int, stdin.readline().split())

    graph[num1].append(num2)
    graph[num2].append(num1)

dfs_li = []
bfs_li = []

dfs(v)
bfs(v)

print(" ".join(map(str, dfs_li)))
print(" ".join(map(str, bfs_li)))