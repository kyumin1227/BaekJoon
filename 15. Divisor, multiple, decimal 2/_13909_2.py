# 1. 2. 3. 4. 5. 6. 7. 8. 9. 10
#    2.    4.    6     8     10
#       3.       6.       9
#          4.          8.    
#             5.             10
#                6
#                   7
#               	   8
#  		                  9
#                            10

# 창문이 열리는 경우는 n의 제곱


n = int(input())

result = 0

for i in range(1, n):
    if i ** 2 <= n:
        result += 1
    
    if i ** 2 > n:
        break

if n == 1:
    result = 1

print(result)