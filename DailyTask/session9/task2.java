package session9;

public class task2 {
	public static void main(String[] args) {
		
		int arr[]= {2,3,4,5,12,24,35,77};
		int target=2 ;
		int left=0;
		int right=arr.length;
		int mid;
		
		while(left<right)
		{
			mid=(left+right)/2;
			if(arr[mid]<= target)
			{
				left=mid+1;
			}
			else 
			{
				right=mid;
			}
		}
		if(left==right)
		{
			System.out.println("Upper bound found at index "+left+" and value "+arr[left]);
		}
	}

}



