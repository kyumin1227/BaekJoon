n = int(input())

digit_count = 0
number_digit = 0

while True:
    digit_count += n
    n -= 9 * (10 ** number_digit)
    if (n > 0):
        number_digit += 1
    else:
        break

print(digit_count)