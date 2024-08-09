from sys import stdin

n = int(input())
times = []

for _ in range(n):
    times.append(tuple(map(int, input().split())))

# 끝나는 시간이 빠른 순으로 정렬
times.sort(key=lambda x : (x[1], x[0]))

# 가장 빨리 끝나는 회의 기본 선택
time = times[0][1]
count = 1

for i in range(1, n):
    # i번째 회의의 시작 시간이 이전에 선택한 회의의 끝나는 시간보다 크거나 같으면 선택
    if times[i][0] >= time:
        time = times[i][1]
        count += 1

print(count)
