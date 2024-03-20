import queue

n = int(input())

que = queue.Queue()

for i in range(1, n + 1):
    que.put(i)

for _ in range(n - 1):
    que.get()
    que.put(que.get())

print(que.get())