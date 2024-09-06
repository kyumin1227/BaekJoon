from sys import stdin

n = int(input())
input = stdin.readline

weights = []
heights = []
ranks = [0 for _ in range(n)]

for _ in range(n):
    weight, height = map(int, input().rstrip().split())
    weights.append(weight)
    heights.append(height)

count = 1

# 전체의 등수를 매길때 까지 반복
while count <= n:
    max_weight = max(weights)
    max_weight_index = weights.index(max_weight)

    max_height = max(heights)
    max_height_index = heights.index(max_height)

    same = 1

    # 현재 상황에서 가장 덩치가 큰 경우
    if max_weight_index == max_height_index:
        ranks[max_weight_index] = count
        weights[max_weight_index] = 0
        heights[max_height_index] = 0

        # 몸무게와 키가 같은 사람이 있는 경우
        while max_weight == max(weights):
            if max_height == max(heights):
                max_weight_index = weights.index(max_weight)
                max_height_index = heights.index(max_height)
                ranks[max_weight_index] = count
                weights[max_weight_index] = 0
                heights[max_height_index] = 0

                same += 1

    # 현재 상황에서 가장 덩치가 크지 않은 경우
    else:
        for i in range(n):
            if heights[i] > heights[max_weight_index]:
                same += 1
                weights[i] = 0
                heights[i] = 0
                ranks[i] = count

        weights[max_weight_index] = 0
        heights[max_weight_index] = 0
        ranks[max_weight_index] = count
    
    count += same

print(" ".join(map(str, ranks)))
