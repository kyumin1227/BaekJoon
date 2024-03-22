# 값을 입력 받고 queue인 값만 deque에 저장
import collections

n = int(input())    # 자료구조의 개수
list_stack_or_queue = list(input().split()) # 큐인지 스택인지 구분하는 리스트
default_values = list(map(int, input().split()))    # 기본 값
m = int(input())    # 삽입할 수열의 길이
input_value = list(map(int, input().split()))   # 삽입할 값

main_deque = collections.deque()
result = ""

for index, value in enumerate(list_stack_or_queue):
    if value == "1":
        continue
    main_deque.append(default_values[index])

# 입력 값을 deque에 넣고 가장 끝 값을 뺌
for value in input_value:
    main_deque.appendleft(value)
    result += str(main_deque.pop()) + " "

# 가장 끝 값만 모아서 정답으로 출력
print(result)