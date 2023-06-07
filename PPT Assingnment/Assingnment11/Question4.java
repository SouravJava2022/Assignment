package Assingnment11;
/*
 * Given an array of integers `nums` containing `n + 1` integers where each integer is in the range `[1, n]` inclusive.

There is only **one repeated number** in `nums`, return *this repeated number*.

You must solve the problem **without** modifying the array `nums` and uses only constant extra space.
 */
public class Question4 {
    public static void main(String[] args) {
        int [] nums = {1,3,4,3,2};

        int a=Solution(nums);
        System.out.println(a);
    }

    private static int Solution(int[] nums) {
        int low=1;int high=nums.length-1;
       int duplicate=-1;
        while(high>low){
            int mid=(high+low)/2;
            int count=0;
            for (int i : nums) {
                if(i<=mid)
                count++;
            }
          if(count>mid){
            duplicate=mid;

            high=mid-1;
          }
          else{
            low=mid+1;
          }
        }
        return duplicate;
    }
}
