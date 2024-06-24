from sys import stdin

input = stdin.readline

while True:
    num1, num2, num3 = map(int, input().rstrip().split())
    
    # 모두 0인 경우 종료
    if num1 + num2 + num3 == 0:
        break
    
    # 피타고라스의 정리 이용
    if max(num1, num2, num3) ** 2 * 2 == num1 ** 2 + num2 ** 2 + num3 ** 2:
        print("right")
    else:
        print("wrong")