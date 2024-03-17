import sys

n = int(input())

arr = []
num1 = 0
num2 = 0
gcd = 0

for i in range(n):
    num = int(sys.stdin.readline().rstrip())
    arr.append(num)
    if i == 2:
        num1 = arr[-1] - arr[-2]
        num2 = arr[-2] - arr[-3]
        while num2 !=0:
            num1, num2 = num2, num1 % num2
        gcd = num1

    elif i > 2:
        num1 = arr[-1] - arr[-2]
        num2 = 1
        check = False
        
        while gcd * num2 < num1:
            if gcd * num2 == num1:
                check = True
                break
            num2 += 1
        
        if not check:
            num2 = gcd
            while num2 !=0:
                num1, num2 = num2, num1 % num2
            gcd = num1

num = 1
count = 0
while gcd * num + arr[0] < arr[-1]:
    if not arr[0] + gcd * num in arr:
        count += 1
    num += 1

print(count)