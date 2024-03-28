import sys

input = sys.stdin.readline

n = int(input())

num_list = []
num_dic = dict()
sum = 0

for _ in range(n):
    num = int(input())

    num_list.append(num)
    sum += num
    if num in num_dic:
        num_dic[num] += 1
    else:
        num_dic[num] = 1

num_list.sort()

mode_count = max(num_dic.values())
mode_nums = []
mode_num = 0

for key, value in num_dic.items():
    if value == mode_count:
        mode_nums.append(key)

if len(mode_nums) > 1:
    mode_nums.sort()
    mode_num = mode_nums[1]
else:
    mode_num = mode_nums[0]

print(int(round(sum / n, 0)))           # 평균
print(num_list[n // 2])                 # 중앙값
print(mode_num)                         # 최빈값
print(max(num_list) - min(num_list))    # 범위