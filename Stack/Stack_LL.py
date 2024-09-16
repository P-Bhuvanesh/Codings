class Node:
    def __init__(self, data):
        self.data = data
        self.next = None 
        
class Stack_LL:
    def __init__(self):
        self.head = None 
        
    def isEmpyt(self):
        return self.head is None
        
    def push(self, data):
        nn = Node(data)
        nn.next = self.head
        self.head = nn 
        print(f"Node {data} pushed to the Stack")
        
    def pop(self):
        
        if self.head is None:
            return "Stack is Empty"
        
        else:
            pop_node = self.head 
            self.head = self.head.next 
            return pop_node.data 
            
    def peek(self):
        
        if self.head is None:
            return "Stack is Empty"
        
        return self.head.data 
        
    def display(self):
        
        if self.isEmpyt():
            return "Stack is Empty"
        
        temp = self.head 
        while temp:
            print(temp.data,end=" ")
            temp = temp.next
        print()
        
stack = Stack_LL()
stack.push(10)
stack.push(20)
stack.push(30)
stack.display()

print(f"Popped Element : {stack.pop()}")
stack.display()  

print(f"Top most element: {stack.peek()}")
    
        