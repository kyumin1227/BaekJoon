# 해당 위치에 퀸을 둬도 되는지 확인하는 함수
def check(arg_y):
    if arg_y in queens_y_list:
        return False
    
    # 대각선 확인
    for i in range(len(queens_y_list)):
        if arg_y - len(queens_y_list) == queens_y_list[i] - i:
            return False
        if arg_y + len(queens_y_list) == queens_y_list[i] + i:
            return False
        
    return True

# 퀸의 위치를 추가하고 빼는 함수
def backtracking():
    global result
    # n 만큼 리스트에 추가되면 결과 값 1추가 후 반환
    if len(queens_y_list) == n:
        result += 1
        return
    
    for i in range(n):
        if check(i):
            queens_y_list.append(i)
            backtracking()
            queens_y_list.pop()
    

# 각 라인 별로 퀸의 y 좌표를 저장하는 리스트
queens_y_list = []
result = 0

n = int(input())

backtracking()

print(result)