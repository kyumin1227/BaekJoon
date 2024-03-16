n, m = map(int, input().split())

num1 = 1    # 첫 번째 수에 곱할 수
num2 = 1    # 두 번째 수에 곱할 수

while True:
    if n * num1 == m * num2:
        print(n * num1)
        break
    elif n * num1 > m * num2:
        num2 += 1
    else:
        num1 += 1