n = int(input())

arr = [True for _ in range(n + 1)]

for i in range(2, n + 1):
    num = i
    while num <= n:
        if arr[num] == True:
            arr[num] = False
        else:
            arr[num] = True
        num += i

# bool 배열을 sum 할 경우 true는 1로 false는 0으로 계산
print(sum(arr) - 1)