s = input()

alpha = "abcdefgh"

x = alpha.index(s[0]) + 1
y = int(s[1])

result_list = [[x + 2, y + 1], [x + 2, y - 1], [x - 2, y + 1], [x - 2, y - 1], 
               [x + 1, y + 2], [x + 1, y - 2], [x - 1, y + 2], [x - 1, y - 2]]

result = 0
for tmp in result_list:
    if tmp[0] > 8 or tmp[1] > 8 or tmp[0] < 1 or tmp[1] < 1:
        pass
    else:
        result += 1

print(result)