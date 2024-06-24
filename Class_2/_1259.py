from sys import stdin

input_numbers = stdin.readlines()

for number in input_numbers:
    check_num = number.rstrip()
    if check_num == "0":
        break
    isTrue = True
    for i in range(len(check_num) // 2):
        if check_num[i] != check_num[-1 - i]:
            isTrue = False

    print("yes" if isTrue else "no")