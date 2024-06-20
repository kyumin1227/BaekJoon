# 계산
def cal():
    result = numbers[0]
    global max_num
    global min_num
    
    # 연산자에 따른 계산
    for i in range(len(operator_list)):
        if operator_list[i] == 0:
            result += numbers[i + 1]
        elif operator_list[i] == 1:
            result -= numbers[i + 1]
        elif operator_list[i] == 2:
            result *= numbers[i + 1]
        else:
            if result > 0:
                result //= numbers[i + 1]
            else:
                result *= -1
                result //= numbers[i + 1]
                result *= -1

    if result > max_num:
        max_num = result
    if result < min_num:
        min_num = result
        

def backtracking():
    if len(operator_list) == n - 1:
        cal()
    
    for i in range(4):
        if operator[i] != 0:
            operator_list.append(i)
            operator[i] -= 1
            backtracking()
            operator_list.pop()
            operator[i] += 1


operator_list = []

n = int(input())
numbers = list(map(int, input().split()))
operator = list(map(int, input().split()))

max_num = float("inf") * -1
min_num = float("inf")

backtracking()

print(max_num)
print(min_num)