import sys

input = sys.stdin.readline

N, M = map(int, input().split())

dict = {}
for i in range(N):
    name = input().rstrip()
    dict[i + 1] = name
    dict[name] = i + 1


for i in range(M):
    check = input().rstrip()
    if check.isdigit():
        print(dict.get(int(check)))
    else:
        print(dict.get(check))