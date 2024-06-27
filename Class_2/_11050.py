def factorial(arg_num):
    return_num = arg_num
    for i in range(1, arg_num):
        return_num *= i

    return return_num

n, k = map(int, input().split())

if k == 0 or n - k == 0:
    print(1)
else:
    print(factorial(n) // ((factorial(n - k)) * factorial(k)))