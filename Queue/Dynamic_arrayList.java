import java.util.ArrayList;

class Main {
    private ArrayList<Integer> queue;

    public Main() {
        queue = new ArrayList<>();
    }

    public void enqueue(int data) {
        queue.add(data);
        System.out.println(data+" enqueued to the queue");
    }

    public void dequeue() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.println("Dequeued element in the queue is: "+queue.get(0));
        queue.remove(0);
    }

    public void display() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty!");
        } else {
            System.out.println("Queue: " + queue);
        }
    }
    
    public void peek(){
        if (queue.isEmpty())
        {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.println("Top element is: "+queue.get(0));
    }
    
    public boolean isEmpty()
    {
        return queue.size() == 0;
    }
    
    
    public int size()
    {
        return queue.size();
    }
    
    public static void main(String[] args) {
        Main queue = new Main();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.display();
        
        queue.dequeue();
        queue.display();
        
        queue.peek();
        
        System.out.print("Size of the queue: "+queue.size());
        
        queue.enqueue(40);
        queue.enqueue(50);
        
        queue.display();
    }
}