import sys

input = sys.stdin.readline

n, m = map(int, input().split())
word_dic = dict()

for i in range(n):
    word = input().rstrip()

    if len(word) < m:
        continue

    if word in word_dic:
        word_dic[word] += 1
    else:
        word_dic[word] = 1

# 람다를 활용하여 딕셔너리 정렬
sorted_dic = dict(sorted(word_dic.items()
                         , key = lambda item : (-item[1], -len(item[0]), item[0])))

for word in sorted_dic.keys():
    print(word)