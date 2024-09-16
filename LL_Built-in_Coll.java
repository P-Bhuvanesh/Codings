import java.util.*;

class Main{
    public static void main(String args[])
    {
        LinkedList<Integer> ll = new LinkedList<>();
        
        ll.add(10);
        ll.add(20);
        ll.add(30);
        
        ll.add(1,15);//pos, data
        
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(11);
        temp.add(12);
        temp.add(13);
        temp.add(14);
        
        ll.addAll(temp);// ll.addAll(index, <Collection>);
        
        ll.addFirst(0);// Add at begnning;
        
        ll.addLast(100);// Append at last;
        
        System.out.println(ll.get(2)); // element at second index
        System.out.println(ll.getFirst()); // element at 0th index
        System.out.println(ll.getLast()); // element at last index
        
        System.out.println(ll.contains(10)); // Check wheather the given element present in the LinkedList
        
        
        System.out.println(ll);
        System.out.println(ll.element());// retirives the head element
        
        System.out.println(ll.size());
        
        System.out.println(ll.pop());// pop out the first element ALTERNATIVE: poll() => remove first element.
        // pollFirst(), pollLast()
        
        System.out.println(ll.peek());// peek operation
        
        ll.offer(101);// add element at last
        ll.push(1); // add at first
        System.out.println(ll);
        
        ll.remove();// remove(index) & remove(object)
        //removeFirst && removeLast
        System.out.println(ll);         
        
    }
}
