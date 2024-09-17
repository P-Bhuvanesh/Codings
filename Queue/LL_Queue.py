class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class LL_Queue:
    def __init__(self):
        self.front = self.rear = None

    def enqueue(self, data):
        new_node = Node(data)
        if self.rear is None: # This is the firsts element in the queue 
            self.front = self.rear = new_node
            print(f"Node {data} enqueued")
            return
        self.rear.next = new_node
        self.rear = new_node
        print(f"Node {data} enqueued")

    def dequeue(self):
        if self.isEmpty():
            print("Queue is empty!")
            return
        dequeued_value = self.front.data
        self.front = self.front.next
        if self.front is None: #After deletion no node i.e deleted node is the only node in the queue
            self.rear = None  # Set rear too null as no element in the queue
        return dequeued_value

    def display(self):
        if self.isEmpty():
            print("Queue is empty!")
            return
        print("Queue element: ",end="")
        temp = self.front
        while temp:
            print(temp.data, end=" ")
            temp = temp.next
        print()
        
    def peek(self):
        return self.front.data;
        
    def lastElement(self):
        return self.rear.data;
        
    def isEmpty(self):
        return self.front == None 


queue = LL_Queue()
queue.enqueue(10)
queue.enqueue(20)
queue.enqueue(30)
queue.display()

print(f"Dequeued element: {queue.dequeue()}")
queue.display()

print(f"First element: {queue.peek()}")
print(f"Last element: {queue.lastElement()}")

print(f"Dequeued element: {queue.dequeue()}")
print(f"Dequeued element: {queue.dequeue()}")
print(f"Dequeued element: {queue.dequeue()}")

print(f"Is queue empty?: {queue.isEmpty()}")

