import sys

input = sys.stdin.readline

n = int(input())

num_list = []
num_set = set()
sum = 0

for _ in range(n):
    num = int(input())

    num_set.add(num)
    num_list.append(num)
    sum += num

num_list.sort()

mode_count = 0
mode_num = 0

# 최빈값 구하기
for i in num_set:
    i_count = num_list.count(i)

    if mode_count < i_count:
        mode_num = i
        mode_count = i_count

print(int(round(sum / n, 0)))           # 평균
print(num_list[n // 2])                 # 중앙값
print(mode_num)                         # 최빈값
print(max(num_list) - min(num_list))    # 범위