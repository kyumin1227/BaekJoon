n = int(input())

for i in range(n):
    print(" " if i % 2 == 1 else "", end="")
    print("* " * n)