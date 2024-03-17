from sys import stdin

input = stdin.readline

primes = [True for _ in range(123456 * 2)]

for i in range(2, len(primes)):
    num = i
    check_num = 2
    while num * check_num < len(primes):
        primes[num * check_num] = False
        check_num += 1

while True:
    result = 0
    num = int(input())

    if num == 0:
        break
    
    for i in range(num + 1, num * 2):
        if primes[i] == True:
            result += 1
    
    if num == 1:
        result = 1
    
    print(result)