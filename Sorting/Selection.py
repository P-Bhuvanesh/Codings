l = [33, 24, 1, 97, 36, 56]

for i in range(len(l)):
    minind = i 
    for j in range(i+1,len(l)):
        if l[j]<l[minind]:
            minind = j 
    if minind != i:
        l[i],l [minind] = l[minind],l[i]
        
print(l)

"""
Template implementation for all lang


l = [33, 24, 1, 97, 36, 56]

for i in range(len(l)):
    # Assume the minimum is the first element in the unsorted portion
    mini_index = i
    for j in range(i + 1, len(l)):  # Start from the next element
        if l[j] < l[mini_index]:  # Compare with current minimum
            mini_index = j  # Update the index of the minimum
    
    # Swap only if a new minimum was found
    if mini_index != i:
        l[i], l[mini_index] = l[mini_index], l[i]  # Swap using tuple unpacking

print(l)

""" 
