import sys

input = sys.stdin.readline

n = int(input())

users = set()
chat = ""
result = 0

for i in range(n):
    chat = input().rstrip()
    
    # ENTER 가 입력되면 리스트 초기화
    if chat == "ENTER":
        users = set()
    elif not chat in users:
        users.add(chat)
        result += 1

print(result)