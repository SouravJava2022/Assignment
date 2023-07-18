package in.deb;

public class Q4 {
	 public void moveZeroes(int[] nums) {
	        int j = 0;
	        int n=nums.length;
	        for (int i = 0; i < n; i++) {
	            if (nums[i] != 0) {
	                //   Swap - A[j] , A[i]
	                swap(nums, j, i); // Partitioning the array
	                j++;
	            }
	        }
	        for (int i = 0; i < n; i++) {
	            System.out.print(nums[i] + " "); // Print the array
	        }
	    }

	    public static void swap(int[] nums, int a, int b)
	    {
	        int temp = nums[a];
	        nums[a] = nums[b];
	        nums[b] = temp;
	    }

}