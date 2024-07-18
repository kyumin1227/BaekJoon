import sys

def bruteforce(arg_index):
    # 암호가 완성되었을 때 체크
    if len(print_list) == l:
        count = 0
        for char in ("a", "e", "i", "o", "u"):
            if char in print_list:
                count += 1
        if count >= 1 and len(print_list) - count >= 2:
            sys.stdout.write("".join(print_list) + "\n")
        return
    
    # 하나 씩 추가
    for i in range(arg_index, min(c, c - l + arg_index + 1)):
        if number_list[i] not in print_list:
            print_list.append(number_list[i])
            bruteforce(i + 1)
            print_list.pop()


input = sys.stdin.readline

l, c = map(int, input().split())
number_list = list(input().split())
number_list.sort()

print_list = []

bruteforce(0)

sys.stdout.flush()
sys.stdout.close()
