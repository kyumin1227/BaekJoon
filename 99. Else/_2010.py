from sys import stdin

n = int(input())

tabs = stdin.readlines()
sum_num = 0

for tab in tabs:
    sum_num += int(tab.rstrip())

print(sum_num - n + 1)