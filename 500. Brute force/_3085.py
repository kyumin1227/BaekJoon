import copy

n = int(input())

# 배열 생성
colors_list = []

for i in range(n):
    colors_list.append(list(input().strip()))

result = 0

# 가로로 변경
for i in range(n):
    for j in range(n - 1):
        colors_list_cp = copy.deepcopy(colors_list)
        colors_list_cp[i][j] = colors_list[i][j + 1]
        colors_list_cp[i][j + 1] = colors_list[i][j]

        count = 0

        # 변경 된 가로줄 확인
        for ii in range(n - 1):
            if colors_list_cp[i][ii] == colors_list_cp[i][ii + 1]:
                count += 1
                if count > result:
                        result = count
            else:
                count = 0

        count = 0

        # 변경 된 세로줄 확인
        for ii in range(n - 1):
            if colors_list_cp[ii][j] == colors_list_cp[ii + 1][j]:
                count += 1
                if count > result:
                    result = count
            else:
                count = 0

        count = 0

        for ii in range(n - 1):
            if colors_list_cp[ii][j + 1] == colors_list_cp[ii + 1][j + 1]:
                count += 1
                if count > result:
                    result = count
            else:
                count = 0
    

# 세로로 변경
for i in range(n - 1):
    for j in range(n):
        colors_list_cp = copy.deepcopy(colors_list)
        colors_list_cp[i][j] = colors_list[i + 1][j]
        colors_list_cp[i + 1][j] = colors_list[i][j]

        count = 0

        # 변경 된 세로줄 확인
        for ii in range(n - 1):
            if colors_list_cp[ii][j] == colors_list_cp[ii + 1][j]:
                count += 1
                if count > result:
                        result = count
            else:
                count = 0

        count = 0

        # 변경 된 가로줄 확인
        for ii in range(n - 1):
            if colors_list_cp[i][ii] == colors_list_cp[i][ii + 1]:
                count += 1
                if count > result:
                    result = count
            else:
                count = 0

        count = 0

        for ii in range(n - 1):
            if colors_list_cp[i + 1][ii] == colors_list_cp[i + 1][ii + 1]:
                count += 1
                if count > result:
                    result = count
            else:
                count = 0

print(result + 1)