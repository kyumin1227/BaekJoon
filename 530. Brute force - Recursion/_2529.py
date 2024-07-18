import sys

def bruteforce(arg_index):
    global max_num, min_num, max_string, min_string
    # 다 채워진 경우
    if len(number_list) == k + 1:
        s = "".join(map(str, number_list))
        if max_num < int(s):
            max_num = int(s)
            max_string = s
        if min_num > int(s):
            min_num = int(s)
            min_string = s
        return

    # 앞의 부등호에 따라 구분하여 숫자 추가
    if inequality_list[arg_index - 1] == ">":
        for i in range(0, number_list[arg_index - 1]):
            if i not in number_list:
                number_list.append(i)
                bruteforce(arg_index + 1)
                number_list.pop()
    else:
        for i in range(number_list[arg_index - 1] + 1, 10):
            if i not in number_list:
                number_list.append(i)
                bruteforce(arg_index + 1)
                number_list.pop()
            

input = sys.stdin.readline

k = int(input())

inequality_list = list(input().rstrip().split())
number_list = []

max_num = 0
max_string = ""
min_num = 9999999999
min_string = ""

# 함수 호출
for i in range(0, 10):
    number_list.append(i)
    bruteforce(1)
    number_list.pop()

print(max_string)
print(min_string)