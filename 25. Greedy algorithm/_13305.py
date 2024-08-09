n = int(input())
distances = list(map(int, input().split()))
costs = list(map(int, input().split()))

sum_distance = distances[0]
now_cost = costs[0]
result = 0

for i in range(1, n - 1):
    if costs[i] < now_cost:
        result += now_cost * sum_distance
        now_cost = costs[i]
        sum_distance = distances[i]
    else:
        sum_distance += distances[i]

result += now_cost * sum_distance

print(result)