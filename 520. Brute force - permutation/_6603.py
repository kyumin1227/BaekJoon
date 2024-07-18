import sys

def bruteforce(arg_index):
    # 출력할 리스트가 6자리인 경우
    if arg_index == 6:
        sys.stdout.write(" ".join(map(str, print_list)) + "\n")
        return

    for i in range(arg_index, k - 5 + len(print_list)):
        # index가 0이 아니거나 출력할 마지막 숫자보다 큰 경우
        if arg_index == 0 or num_list[i] > print_list[arg_index - 1]:
            print_list.append(num_list[i])
            bruteforce(arg_index + 1)
            print_list.pop()


print_list = []

while True:
    s = list(map(int, sys.stdin.readline().split()))

    k = s[0]

    if k == 0:
        break

    num_list = s[1:]

    bruteforce(0)

    sys.stdout.write("\n")

sys.stdout.flush()
sys.stdout.close()