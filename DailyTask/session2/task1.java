package session2;
import java.util.Arrays;

public class task1 {

	    public static void main(String[] args) {
	        int[] arr = {4, 2, 10, 7, 5, 3, 8};

	        
	        Arrays.sort(arr);

	        
	        int left = 0;
	        int right = arr.length - 1;

	        while (left < right) {
	           
	            int temp = arr[left];
	            arr[left] = arr[right];
	            arr[right] = temp;

	            left++;
	            right--;
	        }

	        System.out.println(Arrays.toString(arr));
	    }
	}



