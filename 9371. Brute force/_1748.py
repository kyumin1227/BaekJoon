n = int(input())

digit_count = 0
number_digit = 1

for i in range(1, n + 1):
    
    if i == 10 ** number_digit:
        number_digit += 1

    digit_count += number_digit

print(digit_count)