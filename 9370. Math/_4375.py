import sys

numbers = list(map(int, sys.stdin.readlines()))

for num in numbers:
    temp = 1
    count = 1
    while temp % num != 0:
        temp += 10 ** count
        count += 1

    print(count)