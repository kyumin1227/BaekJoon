def fibo(number):
    if number <= 1:
        return number
    return fibo(number - 1) + fibo(number - 2)

n = int(input())

print(fibo(n))