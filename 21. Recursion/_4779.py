import sys

# 함수에 배열, 시작 인덱스, 끝 인덱스, 변환 형식을 전달
def convert(array, start, end, b):
    array_range = end - start + 1
    slice_range = array_range // 3
    
    if b == False:
        for i in range(start, end + 1):
            array[i] = False
    elif array_range >= 9:
        convert(array, start, start + slice_range - 1, True)
        convert(array, start + slice_range, start + slice_range * 2 - 1, False)
        convert(array, start + slice_range * 2, end, True)
    elif array_range == 3:
        array[start + 1] = False
    else:
        return
        
nums = sys.stdin.readlines()

for input_num in nums:
    result_list = [True for _ in range(3 ** int(input_num))]

    convert(result_list, 0, len(result_list) - 1, True)

    for value in result_list:
        if value == True:
            print("-", end="")
        else:
            print(" ", end="")
    print()