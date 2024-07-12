def bruteforce(arg_nums, arg_ops):
    
    # 계산이 끝난 경우
    if len(arg_ops) == 0:
        global result

        if arg_nums[0] < result:
            result = arg_nums[0]
        return
    
    # 모든 경우 계산
    for i in range(len(arg_ops)):
        nums = arg_nums[:]
        ops = arg_ops[:]

        if ops[i] == "+":
            nums[i] += nums.pop(i + 1)
            ops.pop(i)
        else:
            nums[i] -= nums.pop(i + 1)
            ops.pop(i)

        bruteforce(nums, ops)
    

expression = input()

nums = []
ops = []

num = ""

result = float("inf")

for s in expression:
    if s != "+" and s != "-":
        num += s
    else:
        ops.append(s)
        nums.append(int(num))
        num = ""

nums.append(int(num))

bruteforce(nums, ops)

print(result)