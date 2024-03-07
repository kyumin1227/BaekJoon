N = int(input())

for i in range(0, N):
    for j in range(N - 1 - i):
        print(end=" ")
    for j in range(i * 2 + 1):
        print("*", end="")
    print()

for i in range(0, N - 1):
    for j in range(i + 1):
        print(end=" ")
    for j in range(N * 2 - 3 - i * 2):
        print("*", end="")
    print()