from sys import stdin

def bruteforce(arg_start, arg_list, arg_cost):
    global min_cost
    # 到着した時
    if arg_start == arrive:
        if arg_cost < min_cost:
            min_cost = arg_cost
        return
    
    if arg_cost >= min_cost:
        return
    
    for city in graph[arg_start]:
        if city[0] not in arg_list:
            arg_list.append(arg_start)
            arg_cost += city[1]
            bruteforce(city[0], arg_list, arg_cost)
            arg_list.pop()
            arg_cost -= city[1]
    

input = stdin.readline

n = int(input())    # 都会の数
m = int(input())    # バースの数

graph = [[] for _ in range(n + 1)]

for _ in range(m):
    depart, arrive, cost = map(int, input().rstrip().split())
    graph[depart].append((arrive, cost))

depart, arrive = map(int, input().rstrip().split())
min_cost = float("inf")

bruteforce(depart, [], 0)

print(min_cost)
