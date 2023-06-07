package Assingnment11;

import java.util.Arrays;

/*
 * Given an array nums containing n distinct numbers in the range [0, n], 
 * return the only number in the range that is missing from the array.
 */
public class Question3 {
    public static void main(String[] args) {
        int []nums = {2,4,5,0,1};
        Arrays.sort(nums);
        int a=BinarySearch(nums);
        System.out.println(a);
    }

    private static int BinarySearch(int[] nums) {
        
        int low=0;
        int high=nums.length-1;
        //int mid=(low+high)/2;
         while (high>low) {
           int mid=(low+high)/2;
            if(nums[mid]>mid) {return high=mid;}
            else{
                low=mid+1;
            }
         }
        return low;
    }
}
