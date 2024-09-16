import java.util.ArrayList;

class Main {
    private ArrayList<Integer> stack;

    public Main() {
        stack = new ArrayList<>();
    }

    public void push(int data) {
        stack.add(data);
        System.out.println(data+" pushed to the stack");
    }
    
    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Popped element is :"+stack.get(stack.size()-1));
        stack.remove(stack.size() - 1);
    }

    public int peek() {
        if (!isEmpty()) {
            return stack.get(stack.size() - 1);
        }
        return -1;
    }


    public boolean isEmpty() {
        return stack.isEmpty();
    }


    public void display() {
        System.out.println(stack);
    }

    public static void main(String[] args) {
        Main stack = new Main();  
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display(); 
        stack.pop();
        stack.display();
        System.out.println("Top element is : "+stack.peek());
    }
}
