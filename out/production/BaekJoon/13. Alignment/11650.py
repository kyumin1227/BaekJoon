N = int(input())
number_list = []
for i in range(N):
    x, y = map(int, input().split())
    number_list.append([x, y])
    
for i in range(N):
    for j in range(N - 1):
        if(number_list[j][0] > number_list[j+1][0]):
            num = number_list[j]
            number_list[j] = number_list[j+1]
            number_list[j+1] = num
        elif(number_list[j][1] > number_list[j+1][1]):
            num = number_list[j]
            number_list[j] = number_list[j+1]
            number_list[j+1] = num
    
for i in number_list:
    print(i[0], i[1])