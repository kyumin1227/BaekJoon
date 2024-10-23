from sys import stdin

def divide(start_x, start_y, size):
    # 앞 뒤에 괄호를 추가하고 네 부분으로 나누어 확인하는 함수
    # 前と後ろに括弧を追加して４部分に分けて確認する関数

    result.append("(")

    for dx, dy in ((0, 0), (size // 2, 0), (0, size // 2), (size // 2, size // 2)):
        check(start_x + dx, start_y + dy, size // 2)

    result.append(")")


def check(start_x, start_y, size):
    # 부분을 확인하여 결과에 따라 숫자를 추가하거나 divide 함수를 호출
    # 部分を確認して結果に従って数字を追加したりdivide関数を呼び出す

    first = datas[start_y][start_x]
    
    for x in range(start_x, start_x + size):
        for y in range(start_y, start_y + size):
            if datas[y][x] != first:
                return divide(start_x, start_y, size)

    result.append(first)
        

input = stdin.readline

n = int(input())

datas = []
result = []

for _ in range(n):
    datas.append(tuple(map(int, input().rstrip())))

check(0, 0, n)

print("".join(map(str, result)))