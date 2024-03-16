num1_child, num1_parent = map(int, input().split())
num2_child, num2_parent = map(int, input().split())

num1 = 1
num2 = 1

while True:
    if num1 * num1_parent == num2 * num2_parent:
        result_child = num1 * num1_child + num2 * num2_child
        result_parent = num1 * num1_parent
        
        result_child_cp = result_child
        result_parent_cp = result_parent

        # 유클리드 호제법
        while result_parent_cp != 0:
            result_child_cp, result_parent_cp = result_parent_cp, result_child_cp % result_parent_cp
        
        
        print(result_child // result_child_cp, result_parent // result_child_cp)
        break
    elif num1 * num1_parent > num2 * num2_parent:
        num2 += 1
    else:
        num1 += 1