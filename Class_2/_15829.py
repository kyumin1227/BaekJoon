n = int(input())
s = input()

alp = [chr(i) for i in range(96, 123)]

sum_num = 0

for i in range(n):
    sum_num += alp.index(s[i]) * (31 ** i)

print(sum_num)