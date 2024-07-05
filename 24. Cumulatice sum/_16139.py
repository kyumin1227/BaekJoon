from sys import stdin

s = stdin.readline().rstrip()

n = int(stdin.readline().rstrip())

t_list = stdin.readlines()

for t in t_list:
    c, start_index, end_index = t.rstrip().split()

    start_index = int(start_index)
    end_index = int(end_index)

    count = 0

    for i in range(start_index, end_index + 1):
        if s[i] == c:
            count += 1

    print(count)