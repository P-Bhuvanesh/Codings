class Node{
    int data;
    Node next;
    
    Node(int data){
        this.data = data;
        this.next = null;
    }
}


class Main{
    
    Node head;
    
    void append(int data)
    {
        Node nn = new Node(data);
        if(head == null) 
        {
            head = nn;
            return;
        }
        Node temp = head;
        while(temp.next != null) temp = temp.next;
        temp.next = nn;
    }
    
    void display()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    
    public static void main(String args[])
    {
        Main list = new Main();
        Main list2 = new Main();
        list2.append(100);
        list.append(10);
        list.append(20);
        list.append(30);
        list.append(40);
        list.display();
        list2.display();
    }
}
