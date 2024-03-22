import queue

# n 크기의 list 생성 후 모든 원소에 list를 할당
n = int(input())
main_list = [[] for _ in range(n)]

# que 또는 stack 을 판명하는 리스트 생성 및 기본 값 할당
list_stack_or_que = list(input().split())
list_value = list(map(int, input().split()))

for index, value in enumerate(list_value):
    main_list[index].append(value)

# 입력값 리스트를 생성
input_value_len = int(input())
list_input_value = list(map(int, input().split()))

# 반복 시키고 결과 문자열에 리턴값 추가
result = ""

for value in list_input_value:
    for index, value_bool in enumerate(list_stack_or_que):
        if value_bool == "1":
            continue
        main_list[index].append(value)
        main_list[index].reverse()
        value = main_list[index].pop()
    
    result += str(value) + " "

print(result)