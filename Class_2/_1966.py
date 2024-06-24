from sys import stdin
from collections import deque

input = stdin.readline

n = int(input())

for i in range(n):
    doc, target_index = map(int, input().rstrip().split())
    doc_list = deque(map(int, input().rstrip().split()))
    count = 0

    while True:
        max_num = max(doc_list)
        num = doc_list.popleft()
        if num >= max_num:
            target_index -= 1
            count += 1
        else:
            doc_list.append(num)
            target_index -= 1
            if target_index < 0:
                target_index = len(doc_list) - 1

        if target_index < 0:
            print(count)
            break