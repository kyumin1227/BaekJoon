n = int(input())
m = int(input())
if m != 0:
    disable_buttons = list(input().split())

able_num = dict()

for num in range(1000000):
    # 해당 숫자로 갈 수 있는지 여부 확인
    disable = False
    if m != 0:
        for disable_button in disable_buttons:
            if disable_button in str(num):
                disable = True
                break

    if disable:
        continue

    # 해당 숫자로 가는데 필요한 버튼 수
    len_num = 1
    if num >= 10 and num < 100:
        len_num = 2
    elif num >= 100 and num < 1000:
        len_num = 3
    elif num >= 1000 and num < 10000:
        len_num = 4
    elif num >= 10000 and num < 100000:
        len_num = 5
    elif num >= 100000:
        len_num = 6

    if num > n:
        able_num[num] = num - n + len_num
    elif num < n:
        able_num[num] = n - num + len_num
    else:
        able_num[num] = len_num
        break

if n > 100:
    able_num[1000001] = n - 100
elif n < 100:
    able_num[1000001] = 100 - n
else:
    able_num[1000001] = 0

print(min(able_num.values()))