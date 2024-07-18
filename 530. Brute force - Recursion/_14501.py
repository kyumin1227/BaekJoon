from sys import stdin

def bruteforce(arg_day, arg_pay):
    # 퇴사 날짜가 된 경우에 번 금액을 확인
    global result
    if arg_day == n:
        if arg_pay > result:
            result = arg_pay
        return

    # 상담을 하는 경우 (퇴사 날짜 이전인지 확인)
    if arg_day + days[arg_day][0] <= n:
        bruteforce(arg_day + days[arg_day][0], arg_pay + days[arg_day][1])
    # 상담을 하지 않는 경우
    bruteforce(arg_day + 1, arg_pay)


input = stdin.readline

n = int(input())

days = []
result = 0

for _ in range(n):
    day, pay = map(int, input().split())
    days.append((day, pay))

bruteforce(0, 0)

print(result)
