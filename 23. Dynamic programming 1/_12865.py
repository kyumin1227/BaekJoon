from sys import stdin

def backtracking(arg_start, arg_weight, arg_value):
    global max_value
    # 가치를 확인하여 더 클 경우 갱신
    if arg_value > max_value:
        max_value = arg_value

    if arg_weight >= k:
        return

    for i in range(arg_start, len(items)):
        now_weight, now_value = items[i]
        if arg_weight + now_weight <= k:
            backtracking(arg_start + 1, arg_weight + now_weight, arg_value + now_value)
    return


input = stdin.readline

n, k = map(int, input().split())
items = []
max_value = 0

for _ in range(n):
    items.append(tuple(map(int, input().split())))

backtracking(0, 0, 0)

print(max_value)
