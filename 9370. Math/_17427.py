n = int(input())

# 1은 모든 수의 약수이므로 다 더하기
result = n

# i를 i 씩 올리면서 n보다 같거나 클 때까지 확인해서 i를 약수로 가지는 수의 개수를 확인
for i in range(2, n + 1):
    num = i
    count = n // i

    result += i * count

print(result)