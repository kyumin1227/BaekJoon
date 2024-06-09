import sys

def check():
    global sum_num, result
    # 다 채워졌을 경우 결과 확인
    if len(answer_list) == len(numbers):
        # 갈 수 없는 경우
        if numbers[answer_list[-1]][answer_list[0]] == 0:
            return
        # 갈 수 있는 경우
        sum_num += numbers[answer_list[-1]][answer_list[0]]
        if sum_num < result:
            result = sum_num
        sum_num -= numbers[answer_list[-1]][answer_list[0]]
        return
    
    # 처음 숫자 세팅
    if len(answer_list) == 0:
        for i in range(len(numbers)):
            if i not in answer_list:
                answer_list.append(i)
                check()
                answer_list.pop()

    # 나머지 숫자 세팅
    else:
        for i in range(len(numbers)):
            # 이미 간 적이 없고 갈 수 있을 때 추가
            if i not in answer_list and numbers[answer_list[-1]][i] != 0:
                sum_num += numbers[answer_list[-1]][i]
                answer_list.append(i)
                check()
                answer_list.pop()
                sum_num -= numbers[answer_list[-1]][i]
    

n = int(input())

input = sys.stdin.readlines
numbers = [list(map(int, i.split())) for i in input()]

answer_list = []
result = float("inf")   # 기본값 무한으로 설정
sum_num = 0

check()

print(result)