data_a = []
n, m = map(int, input().split())
for _ in range(n):
    data_a.append(tuple(map(int, input().split())))

data_b = []
m, k = map(int, input().split())
for _ in range(m):
    data_b.append(tuple(map(int, input().split())))

# 정답 행렬 생성
datas = [[0 for _ in range(k)] for _ in range(n)]

for x in range(k):
    for y in range(n):
        temp = 0
        # 각 원소에는 m개의 값이 더해짐
        for i in range(m):
            temp += data_a[y][i] * data_b[i][x]
        datas[y][x] = temp

for line in datas:
    print(" ".join(map(str, line)))
