# Optimized Python program for implementation of Bubble Sort
def bubbleSort(arr):
    n = len(arr)
    
    # Traverse through all array elements
    for i in range(n):
        swapped = False

        # Last i elements are already in place
        for j in range(0, n-i-1):

            # Traverse the array from 0 to n-i-1
            # Swap if the element found is greater
            # than the next element
            if arr[j] > arr[j+1]:
                arr[j], arr[j+1] = arr[j+1], arr[j]
                swapped = True
        if (swapped == False):
            break

# Driver code to test above
if __name__ == "__main__":
    arr = [64, 34, 25, 12, 22, 11, 90]

    bubbleSort(arr)

    print("Sorted array:")
    for i in range(len(arr)):
        print("%d" % arr[i], end=" ")

"""
Bubble sort : It is that comparing the adjacent element and swaping if the condition trues a<b || a>b 


Alternative approach: 
the below code doesn't strictly follow either bubble sort or selection sort, but it's closer to 
selection sort in that you are looking for the smallest element in the remaining part of the list.

However, selection sort should only swap once per iteration after finding the minimum.

Bubble sort involves adjacent swapping and continuously bubbling the largest element to the correct position 

l = [34, 56, 73, 90, 81, 27]

for i in range(0,len(l)-1):
    for j in range(i+1,len(l)):
        if l[i]>l[j]:
            temp = l[j]
            l[j] = l[i]
            l[i] = temp
print(l)

"""
