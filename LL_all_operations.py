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
        print()
            
    def remove(self, data):
        curr = self.head
        prev = None;
        
        if(curr.data == data):
            self.head = (self.head).next;
            return
        
        while curr.data != data:
            prev = curr
            curr = curr.next
            
        prev.next = curr.next
        
    def search(self, data):
        
        temp = self.head
        while temp != None:
            if(temp.data == data):
                print(data," found in the list")
                return;
            temp = temp.next
        print("Element not found on the list")
        
    def insertAfter(self,data,key):
        temp = self.head
        nn = Node(key)
        while temp.next!=None:
            if(temp.data == data):
                nn.next = temp.next
                temp.next = nn;
                return
            temp = temp.next
        temp.next = nn;
        

l1 = LinkedList();
l1.append(10)
l1.append(20)
l1.append(30)
l1.append(40)
l1.append(50)
l1.append(60)

l1.display()

l1.remove(60)
l1.display()

l1.search(20)

l1.insertAfter(10,25)
l1.display()


'''
   t   
10 20 30 40 50 60
     25

'''
