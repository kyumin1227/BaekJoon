import sys

def check(arg_s):
    length = len(arg_s)

    index = -1

    for i in range(int(length / 2)):
        if arg_s[i] != arg_s[-i - 1]:
            check1 = False
            index = i
            break

    if index == -1:
        return "0"
    
    # 문자열의 변경 없이는 팰린드롭이 아닌 경우 위에서 걸린 index를 참조하여 새로운 문자열 두 개를 만듬
    check1 = True
    check2 = True

    case1 = arg_s[:index] + arg_s[index + 1:]
    case2 = arg_s[:length - index - 1] + arg_s[length - index:]
    
    for i in range(int(length / 2)):
        if case1[i] != case1[-i-1]:
            check1 = False
        if case2[i] != case2[-i-1]:
            check2 = False

    if check1 or check2:
        return "1"

    return "2"



input = sys.stdin.readline

T = int(input())

for _ in range(T):
    s = input().rstrip()

    sys.stdout.write(check(s) + "\n")

sys.stdout.flush()
sys.stdout.close()