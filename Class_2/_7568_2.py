from sys import stdin

input = stdin.readline

n = int(input())

datas = []

for _ in range(n):
    temp = tuple(map(int, input().split()))
    datas.append(temp)

result = []

for i in range(n):
    count = 1

    # i번째 사람 보다 키와 몸무게 모두 무거울 경우 i의 순위를 1 뒤로 미룸
    for j in range(n):  
        if datas[i][0] < datas[j][0]:
            if datas[i][1] < datas[j][1]:
                count += 1
    
    result.append(count)

print(" ".join(map(str, result)))