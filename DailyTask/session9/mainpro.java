package session9;

public class mainpro {
	
		 public static void main(String[] args) {
		        int[] arr = {10, 20, 20, 30, 40, 50};
		        int target = 20;
		        int left = 0, right = arr.length - 1;
		        int rank = arr.length;
		        
		        while (left <= right) {
		            int mid = left + (right - left) / 2;
		            if (arr[mid] >= target) {
		                rank = mid;
		                right = mid - 1; 
		            } else {
		                left = mid + 1;
		            }
		        }
		      
		          {
					
		             System.out.println("Rank of " + target + " is: " + rank);
		        }
	
		}
	}


