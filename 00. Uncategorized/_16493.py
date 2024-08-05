from sys import stdin

input = stdin.readline

n, m = map(int, input().split())
dp = [[0 for _ in range(n + 1)] for _ in range(m + 1)]
chapters = []

for _ in range(m):
    chapters.append(tuple(map(int, input().split())))

for i in range(1, m + 1):   # 챕터
    chapter_day, chapter_page = chapters[i - 1]
    for j in range(1, n + 1):   # 날짜
        if chapter_day > j:
            dp[i][j] = dp[i - 1][j]
        else:
            dp[i][j] = max(dp[i - 1][j], dp[i - 1][j - chapter_day] + chapter_page)

print(dp[m][n])