string1 = input()
string2 = input()

lcs = [[0] * (len(string1) + 1) for _ in range(len(string2) + 1)]

for i in range(len(string1)):
    c = string1[i]

    for j in range(len(string2)):
        if c == string2[j]:
            # 값이 같은 경우 이전 최대값에서 1을 더해서 저장
            lcs[j + 1][i + 1] = lcs[j][i] + 1
        else:
            lcs[j + 1][i + 1] = max(lcs[j + 1][i], lcs[j][i + 1])
        
print(lcs[len(string2)][len(string1)])
