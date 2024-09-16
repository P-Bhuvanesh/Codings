class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Main {
    private Node top;

    
    public Main() {
        this.top = null;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        
        System.out.println("Pushed Node "+data+" to the stack");
    }


    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return;
        }
        int popped = top.data;
        top = top.next;
        System.out.println("Popped Element is: "+popped);
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void display() {
        Node temp = top;
        System.out.print("Elements of the stack : ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Main stack = new Main();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();
        stack.pop();
        stack.display(); 
        System.out.println("Top most element is: "+stack.peek()); 
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println("Top most element is: "+stack.peek()); 
        stack.push(100);
        stack.push(200);
        stack.push(300);
        stack.push(400);
        System.out.println("Top most element is: "+stack.peek()); 
    }
}
