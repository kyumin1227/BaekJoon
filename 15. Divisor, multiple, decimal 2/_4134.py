import sys

input = sys.stdin.readline

n = int(input().rstrip())

check_numbers = []

max_num = 0

for i in range(n):
    num = int(input().rstrip())
    check_numbers.append(num)
    max_num = max(max_num, num)

primes = [False for _ in range(max_num + 100)]

for i in range(2, max_num):
    check_num = 2
    while True:
        primes[i * check_num] = True
        if i * check_num > max_num:
            break
        check_num += 1

for i in check_numbers:
    check_num = i
    while True:
        check_num += 1
        if primes[check_num] == False:
            print(check_num)
            break