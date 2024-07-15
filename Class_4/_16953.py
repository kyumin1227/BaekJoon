a, b = map(int, input().split())

target_b = b

count = 0
while target_b >= a:
    count += 1
    if target_b == a:
        print(count)
        exit()
    elif str(target_b)[-1] == "1":
        target_b = str(target_b)[:-1]
    elif target_b % 2 == 0:
        target_b = target_b // 2
    else:
        print(-1)
        exit()

    target_b = int(target_b)

print(-1)
