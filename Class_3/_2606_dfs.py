# dfs
import sys

def dfs(arg_n):
    visits[arg_n] = True
    for num in com_list[arg_n]:
        if visits[num] == False:
            dfs(num)

com_len = int(input())
n = int(input())
com_cons = sys.stdin.readlines()

com_list = [[] for _ in range(com_len)]
visits = [False for _ in range(com_len)]

for con in com_cons:
    com1, com2 = map(int, con.split())

    com_list[com1 - 1].append(com2 - 1)
    com_list[com2 - 1].append(com1 - 1)

dfs(0)

print(visits.count(True) - 1)