e, s, m = map(int, input().split())

temp_e = 1
temp_s = 1
temp_m = 1

year = 1

while not (temp_e == e and temp_s == s and temp_m == m):
    temp_e += 1
    temp_s += 1
    temp_m += 1
    year += 1

    if temp_e > 15:
        temp_e = 1
    if temp_s > 28:
        temp_s = 1
    if temp_m > 19:
        temp_m = 1

print(year)