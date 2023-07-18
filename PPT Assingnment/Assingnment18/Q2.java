package in.deb;

public class Q2 {
	
	 public void sortColors(int[] nums) {
	        for(int i=0;i<nums.length;i++){
	            for(int j=1;j<nums.length-i;j++){
	                if(nums[j]<nums[j-1]){
	                    int temp=nums[j];
	                    nums[j]=nums[j-1];
	                    nums[j-1]=temp;
	                }
	            }
	        }


	        for(int k=0;k<nums.length;k++){
	            System.out.print(nums[k]+",");
	        }
	    }

}