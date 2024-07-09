import sys

n, m = map(int, sys.stdin.readline().split())
passwords = {}

for i in range(n):
    site, password = sys.stdin.readline().split()
    passwords[site] = password

for i in range(m):
    sys.stdout.write(passwords[sys.stdin.readline().rstrip()] + "\n")

sys.stdout.flush()
sys.stdout.close()