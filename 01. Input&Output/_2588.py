num1 = int(input())
num2 = input()

a = int(num2[0])
b = int(num2[1])
c = int(num2[2])

c *= num1
print(c)
b *= num1
print(b)
a *= num1
print(a)

a *= 100
b *= 10

print(a + b + c)