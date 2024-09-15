class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
        
class LinkedList:
    def __init__(self):
        self.head = None

    # Append a node to the end of the list
    def append(self, data):
        nn = Node(data)
        if self.head is None:
            self.head = nn
            return 
        
        temp = self.head
        while temp.next:
            temp = temp.next
        temp.next = nn
    
    # Display all nodes in the list
    def display(self):
        temp = self.head
        while temp:
            print(temp.data, end=" ")
            temp = temp.next
        print()
    
    # Remove a node with a given value
    def remove(self, data):
        if self.head is None:
            print("List is empty")
            return
        
        curr = self.head
        prev = None
        
        # If the head node itself holds the value to be deleted
        if curr.data == data:
            self.head = curr.next  # Move head to the next node
            return
        
        # Search for the node to be deleted
        while curr and curr.data != data:
            prev = curr
            curr = curr.next
        
        # If the value is not found in the list
        if curr is None:
            print(f"Node with value {data} not found.")
            return
        
        # Unlink the node from the linked list
        prev.next = curr.next
    
    # Search for a node with a given value
    def search(self, data):
        temp = self.head
        while temp:
            if temp.data == data:
                print(data, "found in the list")
                return
            temp = temp.next
        print("Element not found in the list")
    
    # Insert a new node after a given node with a specified value
    def insertAfter(self, data, key):
        temp = self.head
        nn = Node(key)
        
        # Traverse the list to find the node after which to insert
        while temp:
            if temp.data == data:
                nn.next = temp.next
                temp.next = nn
                return
            temp = temp.next
        
        # If the node with the specified data is not found, append at the end
        print(f"Node with value {data} not found, appending {key} at the end.")
        self.append(key)

# Example usage
l1 = LinkedList()
l1.append(10)
l1.append(20)
l1.append(30)
l1.append(40)
l1.append(50)
l1.append(60)

l1.display()         # Output: 10 20 30 40 50 60

l1.remove(60)        # Remove the node with value 60
l1.display()         # Output: 10 20 30 40 50

l1.search(20)        # Output: 20 found in the list

l1.insertAfter(10, 25)  # Insert 25 after 10
l1.display()         # Output: 10 25 20 30 40 50
