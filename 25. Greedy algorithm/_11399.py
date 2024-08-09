n = int(input())

times = list(map(int, input().split()))

result = 0
now = 0

# 최소값을 찾아서 누적시켜 합산
for _ in range(n):
    time = min(times)
    index = times.index(time)
    times.pop(index)

    now += time
    result += now

print(result)