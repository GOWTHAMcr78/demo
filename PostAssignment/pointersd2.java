package PostAssignment;

public class pointersd2 {
	 public static void main(String[] args) {
	        int[] nums = {1, 3, 4, 5, 7, 10, 11};
	        int target = 14;

	        int[] result = findTwoSum(nums, target);

	        if (result != null) {
	            System.out.println("Target sum " + target + " found at indices: " +
	                    result[0] + " and " + result[1] +
	                    " (Values: " + nums[result[0]] + " + " + nums[result[1]] + ")");
	        } else {
	            System.out.println("No two numbers found with target sum " + target);
	        }
	    }

	    public static int[] findTwoSum(int[] nums, int target) {
	        int left = 0;
	        int right = nums.length - 1;

	        while (left < right) {
	            int sum = nums[left] + nums[right];

	            if (sum == target) {
	                return new int[]{left, right};
	            } else if (sum < target) {
	                left++; 
	            } else {
	                right--; 	            }
	        }

	        return null;
	    }
	}

	


