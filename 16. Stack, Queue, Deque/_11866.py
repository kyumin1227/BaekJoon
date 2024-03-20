import queue

n, k = map(int, input().split())

que = queue.Queue()

for i in range(1, n + 1):
    que.put(i)

result = "<"

count = 0

while que.qsize() > 0:

    count += 1

    if que.qsize() == 1:
        result += "{}>".format(que.get())
    elif (count == k):
        result += "{}, ".format(que.get())
        count = 0
    else:
        que.put(que.get())

print(result)