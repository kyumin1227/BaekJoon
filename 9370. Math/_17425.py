import sys

input = sys.stdin.readline

# 테스트 케이스의 개수
t = int(input())

number_list = list()    # 입력 순서를 유지한 숫자 리스트
result_dic = dict() # 수를 key로 해당 값을 item으로 저장 하는 dict

for i in range(t):
    number_list.append(int(input()))

sorted_list = sorted(number_list)   # 크기 순으로 정렬한 숫자 리스트

for num in sorted_list:
    result_dic[num] = num

for i in range(2, sorted_list[-1] + 1):
    num = i
    count = 1
    index = 0

    while num <= sorted_list[-1] + i:
        while num > sorted_list[index]:
            result_dic[sorted_list[index]] += i * (count - 1)
            index += 1

            if index == len(sorted_list):
                break
        
        num += i
        count += 1

for num in number_list:
    print(result_dic[num])