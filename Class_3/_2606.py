# dfs
import sys

# 깊이 탐색
def check(arg_list, arg_n):
    if isVirus[arg_n] == False:
        for i in com_list[arg_n]:
            if i in arg_list:
                continue
            arg_list.append(i)
            check(arg_list, i)
        isVirus[arg_n] = True

len_com = int(input())

n = int(input())

com_list = [[] for _ in range(len_com)] # 연결 된 컴퓨터를 표시
isVirus = [False for _ in range(len_com)]   # 바이러스 감염 여부

com_nums = sys.stdin.readlines()
# 배열 생성
for com in com_nums:
    com1, com2 = map(int, com.split())

    com_list[com1 - 1].append(com2 - 1)
    com_list[com2 - 1].append(com1 - 1)

check([0], 0)

print(isVirus.count(True) - 1)