def linear_search(arr, target):
    for i in range(len(arr)):  
        if arr[i] == target: 
            return i 
    return -1 

arr = [10, 24, 33, 45, 67, 89]
target = 45

result = linear_search(arr, target)

if result != -1:
    print(f"Element found at index {result}")
else:
    print("Element not found")

""" Linear Search

 Time Complexity: O(n) worstCase, O(1) BestCase.
 Space Complexity: O(1)
 
"""