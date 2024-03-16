import sys

n = int(input())

for line in sys.stdin.readlines:
    a, b = map(int, line.rstrip().split())
    print(a + b)
    