from sys import stdin

def allSum(arg_list):
    # 0인 경우 예외처리
    if len(arg_list) == 0:
        return 0
    
    sum_num = arg_list[0] + 1

    for i in range(1, len(arg_list)):
        sum_num *= arg_list[i] + 1
        
    return sum_num - 1


input = stdin.readline

T = int(input())

for _ in range(T):
    n = int(input())
    clothes = []
    types = []
    result = n
    for i in range(n):
        name, cloth_type = input().split()

        if cloth_type in types:
            clothes[types.index(cloth_type)] += 1
        else:
            types.append(cloth_type)
            clothes.append(1)
    
    print(allSum(clothes))