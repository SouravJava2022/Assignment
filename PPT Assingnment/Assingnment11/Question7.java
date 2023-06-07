package Assingnment11;
/*
 * <aside>
💡 **Question 7**

Given an array of integers `nums` sorted in non-decreasing order, find the starting and ending position of a given `target` value.

If `target` is not found in the array, return `[-1, -1]`.

You must write an algorithm with `O(log n)` runtime complexity.

</aside>
 */
import java.util.ArrayList;
import java.util.List;

public class Question7 {
    public static void main(String[] args) {
        int [] nums ={5,7,7,8,8,10};
        int target=8;
        List a=Solution(nums,target);
        System.out.println(a);
    }

    private static List Solution(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        List list=new ArrayList<>();
        while (low<=high) {
            int mid=(high+low)/2;

            if(nums[mid]==target){
                //System.out.println(mid);
                list.add(mid-1);
                list.add(mid);
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
            list.add(-1);
            list.add(-1);
        }

        return list;
    }
}
