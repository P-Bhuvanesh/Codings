def binary_search(arr, target):
    low, high = 0, len(arr)-1
    
    while low<=high:
        mid = (low+high)//2 
        if arr[mid] == target:
            return mid 
        elif arr[mid]>target:
            high = mid-1
        else:
            low = mid+1 
    return -1

arr = [10, 24, 33, 45, 67, 89]
arr.sort()

target = 45

result = binary_search(arr, target)

if result != -1:
    print(f"Element found at index {result}")
else:
    print("Element not found")

""" Binary Search

 Time Complexity: O(log n) worstCase, O(1) BestCase.
 Space Complexity: O(1)
 
"""