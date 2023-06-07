package Assingnment11;
/*
 * Given two integer arrays nums1 and nums2, return an array of their intersection.
 *  Each element in the result must appear as many times as it shows in both arrays 
 * and you may return the result in any order.
</aside>
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question8 {
    public static void main(String[] args) {
        int [] nums1 ={4,9,5};
        Arrays.sort(nums1);
        int [] nums2={9,4,9,8,4};
        Arrays.sort(nums2);
        List list=new ArrayList<>();
        int target=8;
        
        for (int i : nums2) {
            
            int a=Solution(nums1,i);
            list.add(a);
        }
        System.out.println(list);
    }

    private static int Solution(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
       int count=0;
        while (low<=high) {
            int mid=(high+low)/2;

            if(nums[mid]==target){
                System.out.println(mid);
                //list.add(mid-1);
                //list.add(nums[mid]);
                count= nums[mid];
                break;
            }
            else if(target>nums[mid]){
                low=mid+1;
            }
            else if(target<nums[mid]){
                high=mid-1;
            }
        }
        if(low>high){
            // list.add(-1);
            // list.add(-1);
        }

        return count;
    }
}
