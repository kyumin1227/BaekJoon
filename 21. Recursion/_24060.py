def merge_sort(unsorted_list):
    if len(unsorted_list) <= 1:
        return unsorted_list

    mid = int(len(unsorted_list) / 2 + 0.5)

    left = unsorted_list[:mid]
    right = unsorted_list[mid:]

    sorted_left = merge_sort(left)
    sorted_right = merge_sort(right)
    
    return merge(sorted_left, sorted_right)

def merge(left_list, right_list):
    global count
    """왼쪽 오른쪽 리스트를 받아 정렬 하며 병합 후 반환"""
    left_i, right_i = 0, 0
    sorted_list = []

    while left_i < len(left_list) and right_i < len(right_list):
        count += 1
        if left_list[left_i] < right_list[right_i]:
            if count == k:
                print(left_list[left_i])
                exit()
            sorted_list.append(left_list[left_i])
            left_i += 1
        else:
            if count == k:
                print(right_list[right_i])
                exit()
            sorted_list.append(right_list[right_i])
            right_i += 1
        
    while left_i < len(left_list):
        count += 1
        if count == k:
                print(left_list[left_i])
                exit()
        sorted_list.append(left_list[left_i])
        left_i += 1
    
    while right_i < len(right_list):
        count += 1
        if count == k:
                print(right_list[right_i])
                exit()
        sorted_list.append(right_list[right_i])
        right_i += 1

    return sorted_list


n, k = map(int, input().split())
target_list = list(map(int, input().split()))

count = 0

result_list = merge_sort(target_list)

print(-1)