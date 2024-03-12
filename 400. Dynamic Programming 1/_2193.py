bp = [0] * 91

bp[1] = 1

n = int(input())

for i in range(2, n + 1):
    bp[i] = bp[i - 1] + bp[i - 2]
    
print(bp[n])