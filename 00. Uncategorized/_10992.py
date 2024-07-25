n = int(input())

for i in range(n):
    # 마지막
    if i + 1 == n:
        print("*" * (n * 2 - 1))
        continue

    space = n - 1 - i
    space_center = i * 2 - 1 if i != 0 else 0

    # 처음
    if i == 0:
        print(" " * space, end="")
        print("*")
        continue

    print(" " * space + "*" + " " * space_center + "*")