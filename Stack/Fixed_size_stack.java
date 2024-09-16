class Main {
    private int[] stack;
    private int top;
    private int capacity;

    public Main(int size) {
        stack = new int[size];
        capacity = size;
        top = -1;  
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = data;
        System.out.printf("Data %d pushed to the stack\n",data);
    }

    
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        System.out.println("Popped element is : "+stack[top]);
        return stack[top--];
    }

    public int peek() {
        if (!isEmpty()) {
            return stack[top];
        }
        return -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }


    public boolean isFull() {
        return top == capacity - 1;
    }


    public void display() {
        System.out.print("Elements of the stack is :");
        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Main stack = new Main(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();  
        stack.pop();
        stack.display();  
        System.out.println("Top Element is : "+stack.peek());  
    }
}
