package session1;

public class recursion_ex {
	public static int name(int num)
	{
		if(num==0)
		{
		return num;
		}
		return num+name(num-1);
		
		
	}
	public static void main(String[] args) {
		System.out.println(name(10));
	}
}
