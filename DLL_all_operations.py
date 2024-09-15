class Node:
    
    def __init__(self, data):
        self.data = data;
        self.next = None;
        self.prev = None;
        
class DLL:
    
    def __init__(self):
        self.head = None
        
    def append(self, data):
        nn = Node(data)
        
        if self.head is None:
            self.head = nn;
            return
        temp = self.head
        while temp.next:
            temp = temp.next
        nn.prev = temp;
        temp.next = nn;
        
    def search(self, data):
        
        temp = self.head
        while temp:
            if temp.data == data:
                print(data,"found in the DLL")
                return
            temp = temp.next
        print("Data not found in the DLL")
        
    def display(self):
        
        last = self.head
        while last:
            if not(last.next):
                print(last.data)
                return
            print(last.data,end=" <-> ")
            last = last.next
            
    def remove(self, data):
        
        temp = self.head
        while temp:
            if(temp.data == data):
                if(temp.next == None):
                    temp.prev.next = None
                    print(data, " node deleted")
                    return
                if(temp.prev == None):
                    self.head = temp.next
                    print(data, " node deleted")
                    return
                
                temp.prev.next = temp.next
                temp.next.prev = temp.prev
                print(data, "Node deleted")
                
            temp = temp.next
            
    def insertAfter(self, data, key):
        nn = Node(key)
        print(f"Inserting node {key}............")
        temp = self.head
        while temp.next != None:
            if(temp.data == data):
                nn.next = temp.next
                temp.next.prev = nn
                nn.prev = temp
                temp.next = nn
                print(f"Inserted Node after {data}")
                return
            temp = temp.next
        temp.next = nn
        nn.prev = temp
        print(f"Inserted node {key} at the last as {data} not found in the DLL")


dll = DLL()
dll.append(10)
dll.append(20)
dll.append(30)
dll.append(40)
dll.append(50)
dll.append(60)

dll.display()

dll.search(50)

dll.remove(40)
dll.display()

dll.insertAfter(70,1)
dll.display()


