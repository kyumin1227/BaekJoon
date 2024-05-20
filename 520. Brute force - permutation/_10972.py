def backtracking(count):
    # 기본값 세팅
    if count < n:
        result_list.append(input_list[count])
        backtracking(count + 1)

    if result_list != input_list and len(result_list) == n:
        print(" ".join(map(str, result_list)))
        
    else:
        for num in range(input_list[len(result_list)], n + 1):
            if num not in result_list:
                result_list.append(num)
                backtracking()
                result_list.pop()
        

n = int(input())
number_list = [i for i in range(1, n + 1)]
input_list = list(map(int, input().split()))
result_list = []

end = False
for i in range(1, n):
    if not input_list[i - 1] + 1 == input_list[i]:
        end = True
        break
if end:
    print(-1)
else:
    backtracking(0)