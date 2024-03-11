def cal(x, i):
    if (i == 0):
        bp[n - 1] += 1
        return
    if (x == 0):
        cal(x + 1, i - 1)
        return   
    if (x == 9):
        cal(x - 1, i - 1)
        return
    cal(x + 1, i - 1)
    cal(x - 1, i - 1)
    return


n = int(input())

bp = [0] * n

for i in range(1 , 10):
    cal(i, n - 1)
        
print(bp[n - 1] % 1000000000)
