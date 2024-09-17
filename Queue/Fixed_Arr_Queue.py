class FixedQueue:
    def __init__(self, capacity):
        self.queue = [None]*capacity #Creating fixed array 
        self.size = 0 # to track the size of the queue
        self.capacity = capacity # fixed size queue
        self.front = 0 # front pointer for dequeue operation
        self.rear = -1 # rear pointer for enqueue operation
        
    def enqueue(self, data):
        if self.size == self.capacity:
            print("Queue is full")
            return 
        print(f"{data} dequeued in the queue")
        self.rear = (self.rear+1)%self.capacity
        self.queue[self.rear] = data;
        self.size += 1 
        
    def dequeue(self):         
        if self.size == 0:
            print("Queue is empty")
            return
        deq_val = self.queue[self.front];
        self.front = (self.front + 1)%self.capacity
        self.size -= 1
        return deq_val
    
    def display(self):
        
        if self.size == 0:
            print("Queue is empty")
            return 
        print("Elements in the queue: ",end="")
        index = self.front
        for _ in range(self.size):
            print(self.queue[index], end=" ")
            index = (index + 1) % self.capacity
        print()
        
        
queue = FixedQueue(5)
queue.enqueue(10)
queue.enqueue(20)
queue.enqueue(30)
queue.enqueue(40)
queue.enqueue(50)
queue.display()

print("Dequeued element is: ",queue.dequeue())
queue.display()

queue.enqueue(60)
queue.display()

queue.enqueue(70)

print("Dequeued element is:",queue.dequeue())
queue.display()

