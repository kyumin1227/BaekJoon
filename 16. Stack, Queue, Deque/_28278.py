import sys

input = sys.stdin.readline

n = int(input())

stack = []

for i in range(n):
    command = input().rstrip()

    if command == "2":
        if len(stack):
            print(stack.pop())
        else:
            print(-1)
    elif command == "3":
        print(len(stack))
    elif command == "4":
        if len(stack):
            print(0)
        else:
            print(1)
    elif command == "5":
        if len(stack):
            print(stack[-1])
        else:
            print(-1)
    else:
        a, b = map(int, command.split())
        stack.append(b)