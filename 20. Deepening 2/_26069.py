n = int(input())

peoples = {"ChongChong": True}

result = 0

for _ in range(n):
    people1, people2 = map(str, input().split())

    people1_exist = False
    people2_exist = False

    # 이미 만난 기록에 존재하는지 확인
    if people1 in peoples.keys():
        people1_exist = True
    if people2 in peoples.keys():
        people2_exist = True

    # 둘 다 만난 기록이 있으면 둘 중 하나라도 춤 출 때 둘 다 춤 추는 걸로 변경
    if people1_exist and people2_exist:
        if peoples[people1]:
            peoples[people2] = True
        elif peoples[people2]:
            peoples[people1] = True
    # 첫 번째 사람만 기록에 있는 경우
    elif people1_exist:
        if peoples[people1]:
            peoples[people2] = True
        else:
            peoples[people2] = False
    # 두 번째 사람만 기록에 있는 경우
    elif people2_exist:
        if peoples[people2]:
            peoples[people1] = True
        else:
            peoples[people2] = False
    # 둘 다 만난 기록에 없는 경우
    else:
        peoples[people1] = False
        peoples[people2] = False

for value in peoples.values():
    if value == True:
        result += 1

print(result)
