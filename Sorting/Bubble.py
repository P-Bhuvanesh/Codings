l = [34, 56, 73, 90, 81, 27]

for i in range(len(l) - 1):
    for j in range(len(l) - 1 - i):
        if l[j] > l[j + 1]:
            l[j], l[j + 1] = l[j + 1], l[j]
print(l)

"""
Bubble sort 

bubble sort is that comparing the adjacent element and swaping if the condition trues a<b || a>b 


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
