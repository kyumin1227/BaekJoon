def w(arg_a, arg_b, arg_c):
    if arg_a <= 0 or arg_b <= 0 or arg_c <= 0:
        return 1
    
    if arg_a > 20 or arg_b > 20 or arg_c > 20:
        return w(20, 20, 20)
    
    # dp에 이미 값이 저장되어 있다면 해당 값을 반환
    if dp[arg_a][arg_b][arg_c] != 0:
        return dp[arg_a][arg_b][arg_c]
    
    if arg_a < arg_b and arg_b < arg_c:
        dp[arg_a][arg_b][arg_c] = w(arg_a, arg_b, arg_c - 1) + w(arg_a, arg_b - 1, arg_c - 1)\
              - w(arg_a, arg_b - 1, arg_c)
        return dp[arg_a][arg_b][arg_c]
    
    dp[arg_a][arg_b][arg_c] = w(arg_a-1, arg_b, arg_c) + w(arg_a-1, arg_b-1, arg_c)\
          + w(arg_a-1, arg_b, arg_c-1) - w(arg_a-1, arg_b-1, arg_c-1)
    return dp[arg_a][arg_b][arg_c]

dp = [[[0 for _ in range(21)] for _ in range(21)] for _ in range(21)]

while True:
    a, b, c = map(int, input().split())

    if a == -1 and b == -1 and c == -1:
        break

    result = w(a, b, c)

    print(f"w({a}, {b}, {c}) = {result}")
