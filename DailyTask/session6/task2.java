package session6;

public class task2 {

	 int[] arr = new int[6];
	 int top =-1;

  public void push(int num) {

		if(top==5) {
			System.out.println("stack overflow");
		}

		else

		{
			arr[++top]=num;
		}

  }

		public void pop() {
			if(top==0)

			{
				System.out.println("stack is empty");
			}

			if(top!=-1)

			{
				System.out.println("popped the num "+arr[top]);
			}
		}

		public void display() {
			for(int i=0;i<arr.length;i++) {
				System.out.println(arr[i]+" ");

	    	}
     }

		public static void main(String[] args) {
			task2 go=new task2();
			go.push(2);
			go.push(3);
			go.push(4);
			go.push(5);
			go.push(6);
			go.push(7);
			go.pop();
		    go.display();

			

		}

}




