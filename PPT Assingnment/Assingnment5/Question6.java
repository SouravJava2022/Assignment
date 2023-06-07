package Assingnment5;
/*
 * Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears **once** or **twice**, return *an array of all the integers that appears **twice***.

You must write an algorithm that runs in O(n) time and uses only constant extra space.
 */
import java.util.ArrayList;
import java.util.List;

public class Question6 {
    public static void main(String[] args) {
        int []nums = {4,3,2,7,8,2,3,1};
        List list=new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                
                if(nums[i]==nums[j]){
                   // System.out.println(i+"Duplicate"+j);
                    list.add(i);
                }
            }
        }
        System.out.println(list);
    }
}
