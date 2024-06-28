def count_two(arg_num):
    count = 0
    while arg_num >= 2:
        count += arg_num // 2
        arg_num //= 2

    return count

def count_five(arg_num):
    count = 0
    while arg_num >= 5:
        count += arg_num // 5
        arg_num //= 5

    return count

n, m = map(int, input().split())

two = count_two(n) - count_two(n - m) - count_two(m)
five = count_five(n) - count_five(n - m) - count_five(m)

print(min(two, five))