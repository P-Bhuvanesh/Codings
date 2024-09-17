class DynamicQueue:
    def __init__(self):
        self.queue = []
        
    def enqueue(self, data):
        self.queue.append(data)
        print(f"Enqueued {data} into the queue")
        
    def dequeue(self):
        if self.isEmpty():
            print("Queue is empty")
            return         
        print(f"Dequeued element is {self.queue.pop(0)}")
        
    def display(self):
        if self.isEmpty():
            print("Queue is empty")
            return
        
        print("Queue :",self.queue)
        
    def peek(self):
        if self.isEmpty():
            print("Underflow")
            return
        print(f"Top Element is :{self.queue[0]}")
        
    def size(self):
        return len(self.queue)
        
    def isEmpty(self): 
        return self.size() == 0
        

queue = DynamicQueue();

queue.enqueue(10)
queue.enqueue(20)
queue.enqueue(30)
queue.enqueue(40)
queue.enqueue(50)


queue.display()

queue.dequeue()
queue.enqueue(60)
queue.display()

queue.peek()

queue.dequeue()
queue.dequeue()
queue.dequeue()
queue.dequeue()

queue.display()
queue.peek()
        
