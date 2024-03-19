import sys

input = sys.stdin.readline

while True:
    s = input().rstrip()

    # .이 들어올 때 까지 반복
    if s == ".":
        break

    stack = []

    is_ok = True

    for i in s:
        if i == "(":
            stack.append("(")
        elif i == ")":
            if len(stack) != 0 and stack[-1] == "(":
                stack.pop()
            else:
                is_ok = False
                break
        elif i == "[":
            stack.append("[")
        elif i == "]":
            if len(stack) != 0 and stack[-1] == "[":
                stack.pop()
            else:
                is_ok = False
                break
            
    if is_ok and len(stack) == 0:
        print("yes")
    else:
        print("no")