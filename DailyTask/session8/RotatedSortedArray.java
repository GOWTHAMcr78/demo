package session8;

public class RotatedSortedArray {
	
	public static int search(int[] nums, int target) {
        int left = 0, right = nums.length -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) return mid;
            
            if (nums[left] <= nums[mid]) 
            { 
                if (target >= nums[left] && target < nums[mid]) right = mid -1;
                else left = mid +1;
            } 
            else 
            { 
                if (target > nums[mid] && target <= nums[right]) left = mid +1;
                else right = mid -1;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int[] arr = {6,7,8,1,2,3,4,5};
        System.out.println(search(arr, 3));  
    }
}