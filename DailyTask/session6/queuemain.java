package session6;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class queuemain {

		int queue[]=new int[5];
		
		 
		int rear=-1;
		int front=-1;
		
		public void enque(int num)
		{
			if(rear==4)
			{
				System.out.println("queue overflow");
			}
			else
			{
				queue[++rear]=num;
			}
		}
		
		public void deque()
		{
			if(front==4)
			{
				System.out.println("queue empty");
			}
			else
			{
				queue[++front]=0;
			}
		}
		
		public void display()
		{
			for(int i=0;i<queue.length;i++)
			{
				System.out.println(queue[i]);
			}
		}
		public static void main(String[] args) {
			queuemain q1=new queuemain();
			q1.enque(10);
			q1.enque(20);
			q1.enque(30);
			q1.enque(40);
			q1.enque(50);
			q1.display();
			System.out.println();
			q1.deque();
			q1.display();

		}

	}

