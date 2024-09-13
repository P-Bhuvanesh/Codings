class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
        
class LinkedList:
    def __init__(self):
        self.head = None
        
    def append(self,data):
        nn = Node(data)
        if self.head is None:
            self.head = nn
            return 
        
        temp = self.head
        while temp.next:
            temp = temp.next
            
        temp.next = nn;
        
    def display(self):
        temp = self.head
        
        while temp:
            print(temp.data,end=" ");
            temp = temp.next
            
l1 = LinkedList();
l1.append(10);
l1.append(20);
l1.append(30);
l1.append(40);
l1.display();
