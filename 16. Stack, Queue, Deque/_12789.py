n = int(input())

arr = list(map(int, input().split()))   # 줄 배열
stack = []  # 스택 배열
number = 1  # 간식 받을 사람 번호
index = 0   # 줄 번호

while True:
    # 아직 줄에 사람이 남아있는 경우
    if index < n:
        # 해당 번호가 줄의 앞에 서있는 경우
        if arr[index] == number:
            index += 1
            number += 1
        # 스택이 비어있지 않고 스택 앞의 사람이 순서인 경우
        elif len(stack) and stack[-1] == number:
            stack.pop()
            number += 1
        # 다른 번호가 줄의 앞에 서있는 경우
        else:
            stack.append(arr[index])
            index += 1
    # 줄에 사람 다 빠진 경우
    else:
        # 스택에도 사람이 다 빠진 경우
        if not len(stack):
            print("Nice")
            break
        # 스택의 가장 윗 사람이 순서인 경우
        elif stack[-1] == number:
            stack.pop()
            number += 1
        # 스택의 맨 위에 다른 사람이 서있는 경우
        else:
            print("Sad")
            break