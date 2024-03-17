import sys

# 큰 수의 소수를 빠르게 판단하는 방법은 2부터 해당 수의 제곱근(루트 n) + 1까지로 나누어 보는게 효율적입니다.
def is_prime(n):
    if n <= 1:
        return False
    for i in range(2, int(n**0.5) + 1):
        if n % i == 0:
            return False
    return True

input = sys.stdin.readline

n = int(input())

for _ in range(n):
    num = int(input())
    while not is_prime(num):
        num += 1
    print(num)