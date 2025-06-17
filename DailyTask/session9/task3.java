package session9;

import java.util.Scanner;
import java.util.Arrays;

public class task3 {
	
		public static void main(String args[]) {
			Scanner sc=new Scanner(System.in);
			int arr[]= {2,4,4,4,6,7,9};
			Arrays.sort(arr);
			System.out.println("Sorted Array: "+Arrays.toString(arr));
			System.out.println("Enter a target value:");
			int target=sc.nextInt();
			int left=0;
			int right=arr.length;
			while (left < right) {
	            int mid = (left + right) / 2;
	            if (arr[mid] < target) {
	                left = mid + 1;
	            } else {
	                right = mid;
	            }
			}
			int lowerbound=left;
			left=0;
			right=arr.length;
			while (left < right) {
	            int mid = (left + right) / 2;
	            if (arr[mid] <= target) {
	                left = mid + 1;
	            } else {
	                right = mid;
	            }
	        }
	        int upperbound=left;
	        int count=upperbound-lowerbound;
	        System.out.println("Count of given target value is: "+count);
		}

	}


