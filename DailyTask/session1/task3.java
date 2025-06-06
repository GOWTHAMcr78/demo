package session1;

import java.util.Scanner;

public class task3 {
	
	public static int fibonacci(int n)



	{
		if(n<=0)
		
		{
			return 0;
		}
		
		else if(n==1)
		
		{
			return 0;
		}
		
		else if(n==2)
		
		{
			return 1;
		}
		
		else 
			
			return fibonacci(n-1)+fibonacci(n-2);
}
	
	public static void main(String []args)
	
	{

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the limit:");

		int i=sc.nextInt();

		for(int n=0;n<=i;n++)
			
		{

			System.out.println(fibonacci(n));
		}

	}}









	   
	  
