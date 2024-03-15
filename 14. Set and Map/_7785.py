n = int(input())

arr = set()

while n > 0:
    n -= 1
    name, check = input().split()
    if check == "enter":
        arr.add(name)
    else:
        arr.remove(name)

result_arr = list(arr)
result_arr.sort(reverse=True)
for i in result_arr:
    print(i)