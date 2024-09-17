import java.util.*;
class Main {
	public static void main(String args[])
	{
		Queue<Integer> q1 = new PriorityQueue<>();
		
		// Same as above but using LL 
		// Queue<Integer> q2 = new LinkedList<>();

		q1.add(40);
		q1.add(30);
		q1.add(20);
		q1.add(10);

		q1.add(50);

		System.out.println("Element in the list after adding: "+q1);// since priority queue on default it will sort in ascending

		System.out.println("Peek operation: "+q1.peek()); // retrieves top most element
		System.out.println(q1);
		System.out.println("Polling operation: "+q1.poll()); // poll() removes the head element

		System.out.println(q1);
		System.out.println("Remove operation: "+q1.remove(20));// removes 20 from the queue
		System.out.println(q1);
		// System.out.println(q1);

		// Check if the queue contains a specific element
		System.out.println("Does the queue contain 30? " + q1.contains(30));

		// Get the size of the queue
		System.out.println("Size of queue: " + q1.size());

		// Remove all elements from the queue
		q1.clear();

		// Check if the queue is empty
		System.out.println("Is the queue empty? " + q1.isEmpty());

	}
}
