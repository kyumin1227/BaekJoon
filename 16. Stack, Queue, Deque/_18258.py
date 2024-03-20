from collections import deque
import sys

input = sys.stdin.readline

que = deque()

n = int(input())

for i in range(n):
    s = input().rstrip()
    
    if s == "pop":
        if len(que) == 0:
            print(-1)
        else:
            print(que.popleft())
    elif s == "size":
        print(len(que))
    elif s == "empty":
        if len(que) == 0:
            print(1)
        else:
            print(0)
    elif s == "front":
        if len(que) == 0:
            print(-1)
        else:
            print(que[0])
    elif s == "back":
        if len(que) == 0:
            print(-1)
        else:
            print(que[-1])
    else:
        a, num = s.split()
        que.append(int(num))