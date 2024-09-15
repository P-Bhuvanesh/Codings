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
        
        if(self.head == None):
            print("No nodes to display")
            return
        
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
            if temp.data == data:
                # If it's the only node
                if temp.prev is None and temp.next is None:
                    self.head = None
                    print(data, "node deleted")
                    return

                # If it's the first node
                if temp.prev is None:
                    self.head = temp.next
                    self.head.prev = None  # Fixing prev pointer
                    print(data, "node deleted")
                    return

                # If it's the last node
                if temp.next is None:
                    temp.prev.next = None
                    print(data, "node deleted")
                    return

                # If it's a middle node
                temp.prev.next = temp.next
                temp.next.prev = temp.prev
                print(data, "node deleted")
                return
            temp = temp.next
        print("Node with data", data, "not found in DLL")
            
    def insertAfter(self, data, key):
        nn = Node(key)
        print(f"Inserting node {key}............")
        temp = self.head

        while temp:
            if temp.data == data:
                nn.next = temp.next
                if temp.next is not None:  # If inserting in between nodes
                    temp.next.prev = nn
                nn.prev = temp
                temp.next = nn
                print(f"Inserted Node after {data}")
                return
            temp = temp.next

        # If the `data` is not found, insert at the end
        if temp is None:
            self.append(key)
            print(f"Inserted node {key} at the end as {data} was not found in the DLL")


dll = DLL()
dll.append(10)
dll.append(20)
dll.append(30)
dll.append(40)
dll.append(50)
dll.append(60)

dll.display()

dll.search(50)

dll.remove(20)
dll.display()

dll.insertAfter(10,1)
dll.display()


