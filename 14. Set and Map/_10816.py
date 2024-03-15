n = int(input())

cards = {}

for i in input().split(): 
    if cards.get(i) != None:
        cards[i] += 1
    else:
        cards[i] = 1

m = int(input())

for i in input().split():
    result = cards.get(i)
    if result == None:
        result = 0
    print(result, end=" ")