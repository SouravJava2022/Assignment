package Assingnment4;
/*
 * <aside>
💡 **Question 4**
Given an integer array nums of 2n integers, group these integers into n pairs (a1, b1), (a2, b2), ..., (an, bn) such that the sum of min(ai, bi) for all i is **maximized**. Return *the maximized sum*.

**Example 1:**

Input: nums = [1,4,3,2]

Output: 4

</aside>
 */
import java.util.Arrays;

public class Question4 {
    public static void main(String[] args) {
        int a[]={1,4,3,2};
        Arrays.sort(a);
   
        int n=a.length;
   
         int b=Solution(a, n);
         System.out.println(b);
     }
   
     public static int Solution(int[]a,int n){
             int sum=0;
               for(int i=0;i<n;i=i+2){
                 sum=sum+a[i];//Math.min(a[i],a[i+1]);
               }
             return sum;
     }
}
