def power(A, B, C):
    if B == 0:
        return 1
    if B == 1:
        return A % c
    
    # 절반으로 냐눔
    half = power(A, B // 2, C)

    if B % 2 == 0:
        return (half * half) % C
    else:
        return (half * half * A) % C


a, b, c = map(int, input().split())

print(power(a, b, c))
