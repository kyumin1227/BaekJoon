input_s = input()

numbers = "0123456789"

number_sum = 0
alpha_list = []

for char in input_s:
    if char in numbers:
        number_sum += int(char)
    else:
        alpha_list.append(char)

alpha_list.sort()

for char in alpha_list:
    print(char, end="")
if number_sum > 0:
    print(number_sum)