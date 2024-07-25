from sys import stdout

n = int(input())

def hanoi(n, arg_start, arg_end, arg_via):
    if n == 1:
        move(arg_start, arg_end)
    else:
        hanoi(n - 1, arg_start, arg_via, arg_end)
        move(arg_start, arg_end)
        hanoi(n - 1, arg_via, arg_end, arg_start)

def move(arg_start, arg_end):
    # 장대에 원판이 없는 경우
    if len(target_list[arg_start]) == 0:
        return
    
    num = target_list[arg_start].pop()

    if len(target_list[arg_end]) != 0:
        # 원판이 이동하려는 장대의 가장 위 원판보다 큰 경우
        if num > target_list[arg_end][-1]:
            target_list[arg_start].append(num)
            return
        
    stdout.write(str(arg_start) + " " + str(arg_end) + "\n")
        
    target_list[arg_end].append(num)

target_list = [[], [i for i in range(n, 0, -1)], [], []]

count = 1   # 옮긴 횟수

for _ in range(n - 1):
    count *= 2
    count += 1

print(count)

hanoi(n, 1, 3, 2)

stdout.flush()
stdout.close()