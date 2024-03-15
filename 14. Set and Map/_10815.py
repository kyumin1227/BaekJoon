N = int(input())

arr = set(map(int, input().split()))

M = int(input())

check_arr = list(map(int, input().split()))

for i in check_arr:
    if i in arr:
        print("1", end=" ")
    else:
        print("0", end=" ")