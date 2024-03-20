import collections
import sys

input = sys.stdin.readline

deq = collections.deque()

n = int(input())

for _ in range(n):
    command = input().rstrip()

    if command == "3":
        if len(deq) == 0:
            print(-1)
        else:
            print(deq.popleft())
    elif command == "4":
        if len(deq) == 0:
            print(-1)
        else:
            print(deq.pop())
    elif command == "5":
        print(len(deq))
    elif command == "6":
        if len(deq) == 0:
            print(1)
        else:
            print(0)
    elif command == "7":
        if len(deq) == 0:
            print(-1)
        else:
            print(deq[0])
    elif command == "8":
        if len(deq) == 0:
            print(-1)
        else:
            print(deq[-1])
    else:
        command, num = map(int, command.split())
        if command == 1:
            deq.appendleft(num)
        else:
            deq.append(num)