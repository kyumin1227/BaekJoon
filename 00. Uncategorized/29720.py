n, m, k = map(int, input().split())

min_num = n - m * k
max_num = n - (m * (k - 1) + 1)

print(max(0, min_num), max_num)n, m, k = map(int, input().split())

min_num = n - m * k
max_num = n - (m * (k - 1) + 1)

print(max(0, min_num), max_num)