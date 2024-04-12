n = int(input())
move_list = input().split()

x = 1
y = 1

for move in move_list:
    if move == "R":
        x += 1
    elif move == "L":
        x -= 1
    elif move == "U":
        y -= 1
    else:
        y += 1

    if x < 1:
        x = 1
    if x > n:
        x = n
    if y < 1:
        y = 1
    if y > n:
        y = n

print(x, y)