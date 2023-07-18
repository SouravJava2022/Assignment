package in.deb;

public class Question3 {
	 public static int majorityElement(int[] nums) {
	        int n=nums.length;
	        for (int i = 0; i < n; i++) {
	            //selected element is v[i]
	            int cnt = 0;
	            for (int j = 0; j < n; j++) {
	                // counting the frequency of v[i]
	                if (nums[j] == nums[i]) {
	                    cnt++;
	                }
	            }

	            // check if frquency is greater than n/2:
	            if (cnt > (n / 2))
	                return nums[i];
	        }

	        return -1;
	    }

	public static void main(String[] args) {
		int[] num= {2,2,1,1,1,2,2};
		System.out.println("Majority num is "+majorityElement(num));

	}

}