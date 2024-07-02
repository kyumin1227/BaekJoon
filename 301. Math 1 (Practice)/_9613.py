from sys import stdin

def gcd(arg_num1, arg_num2):
    if arg_num2 == 0:
        return arg_num1
    
    return gcd(arg_num2, arg_num1 % arg_num2)

t = int(input())

case_list = stdin.readlines()

for case in case_list:
    num_list = list(map(int, case.rstrip().split()))
    n = num_list.pop(0)
    sum_num = 0

    for i in range(n - 1):
        for j in range(i + 1, n):
            sum_num += gcd(num_list[i], num_list[j])

    print(sum_num)