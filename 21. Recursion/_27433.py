def factorial(number):
    if number <= 1:
        result = 1
    else:
        result = factorial(number - 1) * number

    return result

n = int(input())

print(factorial(n))