class Stack_Array:
    def __init__(self):
        self.stack = []

    def push(self, data):
        print(f"Pushed {data} to stack")
        self.stack.append(data)

    def pop(self):
        if self.isEmpty():
            return "Stack is Empty"
        else:
            print(f"Popped {self.stack[-1]} from the stack")
            return self.stack.pop()

    def peek(self):
        if not self.isEmpty():
            return self.stack[-1]
        else:
            return "Stack is Empty"

    def isEmpty(self):
        return len(self.stack) == 0

    def display(self):
        if not self.isEmpty():
            print(self.stack)
        else:
            print("Underflow")


stack = Stack_Array()
stack.push(10)
stack.push(20)
stack.push(30)
stack.display()

stack.pop()
stack.display()

print(f"Top element from the stack : {stack.peek()}")

print(f"Stack is empty: {stack.isEmpty()}")

stack.push(40)
stack.push(50)

stack.display()
