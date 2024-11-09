import java.util.*;

class Node {
	int data;
	Node left, right;

	Node(int data)
	{
		this.data = data;
		this.right = this.left = null;
	}
}

class Main {

	Node root;

	void insert(int data)
	{
		Node nn = new Node(data);
		if(root == null)
		{
			root = nn;
			return;
		}

		Queue<Node> queue = new LinkedList<>();
		queue.add(root);

		while(!queue.isEmpty())
		{
			Node temp = queue.poll();

			if(temp.left == null)
			{
				temp.left = nn;
				return;
			}
			else queue.add(temp.left);

			if(temp.right == null)
			{
				temp.right = nn;
				return;
			}
			else queue.add(temp.right);
		}
	}

	void display(Node node)
	{
		if(node != null)
		{
			System.out.print(node.data+" ");
			display(node.left);
			display(node.right);
		}
	}

	void delete(int key)
	{
		if(root == null) return;

		Node keyNode = null;
		Node lastNode = null;

		Queue<Node> queue = new LinkedList<>();
		queue.add(root);

		while(!queue.isEmpty())
		{
			lastNode = queue.poll();

			if(lastNode.data == key) keyNode = lastNode;

			if(lastNode.left != null) queue.add(lastNode.left);

			if(lastNode.right != null) queue.add(lastNode.right);
		}

		if(lastNode != null)
		{
			keyNode.data = lastNode.data;
			deleteDeepeest(lastNode);
		}
	}

	void deleteDeepeest(Node dNode)
	{
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);

		while(!queue.isEmpty())
		{
			Node temp = queue.poll();

			if(temp == dNode)
			{
				temp = null;
				return;
			}

			if(temp.left != null)
			{
				if(temp.left == dNode)
				{
					temp.left = null;
					return;
				}
				else queue.add(temp.left);
			}

			if(temp.right != null)
			{
				if(temp.right == dNode)
				{
					temp.right = null;
					return;
				}
				else queue.add(temp.right);
			}
		}

	}


    void levelOrder()
    {
        if(root == null) return;
        
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        
        while(!queue.isEmpty())
        {
            Node temp = queue.poll();
            System.out.print(temp.data+" ");
            if(temp.left != null)   queue.add(temp.left);
            if(temp.right != null)   queue.add(temp.right);
        }
        
    }
    
    
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);

		Main tree = new Main();
		tree.insert(10);
		tree.insert(20);
		tree.insert(30);
		tree.insert(40);
		tree.insert(50);

		tree.display(tree.root);
		System.out.println();
		tree.delete(50);
		tree.display(tree.root);
		
		System.out.println();
		
		tree.levelOrder();
	}

}