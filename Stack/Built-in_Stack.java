import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Elements of the stack: "+stack);  

        System.out.println("Top element of the stack is: "+stack.peek());
            
        System.out.println("Popped element is: "+stack.pop());
        System.out.println("Elements of the stack: "+stack); 
        
        System.out.println("Popped element is: "+stack.pop());
        System.out.println("Popped element is: "+stack.pop());
        System.out.println("Stack is Empty: "+stack.isEmpty()); 
        
        System.out.println("Popped element is: "+stack.pop()); 
    }
}
