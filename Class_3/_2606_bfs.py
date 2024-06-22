# bfs
from collections import deque
from sys import stdin

com_len = int(input())
n = int(input())
com_connects = stdin.readlines()

com_list = [[] for _ in range(com_len)]
visits = [False for _ in range(com_len)]

for connect in com_connects:
    com1, com2 = map(int, connect.split())
    com_list[com1 - 1].append(com2 - 1)
    com_list[com2 - 1].append(com1 - 1)

Q = deque([0])
while Q:
    c = Q.popleft()
    visits[c] = True
    for i in com_list[c]:
        if visits[i] != True:
            Q.append(i)

print(visits.count(True) - 1)