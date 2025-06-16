package session6;
import java.util.Arrays;

public class task3 {

	Node front;
	Node rear;
	class Node{
		int data;
		Node next;
		
		Node(int data)
		{
			this.data=data;
			
		}
	}
	
	task3()
	{
		front=null;
		rear=null;
	}
	
	public void enque(int data)
	{
		Node newnode=new Node(data);
		if(front==null)
		{
			front=newnode;
			rear=newnode;
		}
		else
		{
			rear.next=newnode;
			rear=newnode;
		}
	}
	
	public void deque()
	{
		if(front==null)
		{
			System.out.println("queue empty");
		}
		else {
			
		front=front.next;
	
		}	
		
	}
	public void display()
	{
		Node node=front;
		while(node!=null)
		{
			System.out.println(node.data);
			node=node.next;
		}
	}
	public static void main(String[] args) {
		task3 q1=new task3();
		q1.enque(10);
		q1.enque(20);
		q1.enque(30);
		q1.enque(40);
		q1.enque(50);
		q1.display();
		System.out.println();
		q1.deque();
		q1.deque();
		q1.display();

	}

}
