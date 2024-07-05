from sys import stdin

s = stdin.readline().rstrip()

n = int(stdin.readline().rstrip())

dp = [[0 for _ in range(26)] for _ in range(len(s))]

dp[0][ord(s[0]) - 97] += 1

for i in range(1, len(s)):
    for j in range(26):
        dp[i][j] = dp[i - 1][j]
    dp[i][ord(s[i]) - 97] += 1

t_list = stdin.readlines()

for t in t_list:
    c, start_index, end_index = t.rstrip().split()

    start_index = int(start_index)
    end_index = int(end_index)

    if start_index == 0:
        print(dp[end_index][ord(c) - 97])
    else:
        print(dp[end_index][ord(c) - 97] - dp[start_index - 1][ord(c) - 97])