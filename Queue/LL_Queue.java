class Node{
    int data;
    Node next;
    
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}

class Main{
    
    private Node rear, front;
    
    public Main()
    {
        rear = front = null;
    }
    
    public void enqueue(int data)
    {
        Node nn = new Node(data);
        if(rear == null)
        {
            front = rear = nn;
            System.out.println("Node "+data+" is enqueued to the queue");
            return;
        }
        rear.next = nn;
        rear = nn;
        System.out.println("Node "+data+" is enqueued to the queue");
    }
    
    public int dequeue()
    {
        if(front == null)
        {
            System.out.println("Queue is empty");
            return -1;
        }
        
        int deq_ele = front.data;
        front = front.next; 
        
        if(rear == null) front = null;
        
        return deq_ele;
    }
    
    public void display()
    {
        if(front == null)
        {
            System.out.println("Queue is empty");
            return;
        }
        Node temp = front;
        System.out.print("Queue elements: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    
    
    public boolean isEmpty()
    {
        return front == null;
    }
    
    public int peek()
    {
        return front.data;
    }
    
    public int lastAppendedData()
    {
        return rear.data;
    }
    
    public static void main(String args[])
    {
        Main ll = new Main();
        ll.enqueue(10);
        ll.enqueue(20);
        ll.enqueue(30);
        ll.enqueue(40);
        ll.enqueue(50);
        
        ll.display();
        
        System.out.println("Dequeued element is: "+ll.dequeue());
        ll.display();
        
        
        System.out.println("Queue is empty: "+ll.isEmpty());
        System.out.println("Queue peek(next element to the removed): "+ll.peek());
        System.out.println("Queue last inserted element: "+ll.lastAppendedData());
    }
    
}