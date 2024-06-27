n = int(input())
size_list = list(map(int, input().split()))
t, p = map(int, input().split())

t_count = 0
for size in size_list:
    t_count += size // t
    if size % t > 0:
        t_count += 1

print(t_count)
print(n // p, n % p)