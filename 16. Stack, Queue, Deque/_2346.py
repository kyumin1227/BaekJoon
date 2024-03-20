import collections

n = int(input())

balloons = collections.deque()
balloons.extend(list(map(int, input().split())))

# 순서를 기록할 deque 생성
nums = collections.deque()
for i in range(1, n + 1):
    nums.append(i)

result = ""

for i in range(n):
    num = balloons.popleft()
    result_num = nums.popleft()

    # 가장 앞의 풍선을 뺏기 때문에 수 보정
    if num > 0:
        num -= 1

    # 0이 될때 까지 순서를 변경
    if len(nums) != 0:
        while num != 0:
            if num > 0:
                balloons.append(balloons.popleft())
                nums.append(nums.popleft())
                num -= 1
            else:
                balloons.appendleft(balloons.pop())
                nums.appendleft(nums.pop())
                num += 1

    result += str(result_num) + " "

print(result)