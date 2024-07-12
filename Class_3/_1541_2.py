expression = input()

nums = []

# - 뒤의 값을 최대한 키우면 최소값이 나오기 때문에 - 기준으로 분리 하여 분리된 내부 값을 다 더함
for ex in expression.split("-"):
    nums.append(sum(map(int, ex.replace("+", " ").split())))

result = nums[0]

for i in range(1, len(nums)):
    result -= nums[i]

print(result)