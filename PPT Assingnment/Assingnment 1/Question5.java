/*
 * 💡 **Q5.** You are given two integer arrays nums1 and nums2, 
 * sorted in non-decreasing order, and two integers m and n, 
 * representing the number of elements in nums1 and nums2 respectively.

   Merge nums1 and nums2 into a single array sorted in non-decreasing order.

    The final sorted array should not be returned by the function, 
    but instead be stored inside the array nums1. To accommodate this, 
    nums1 has a length of m + n, where the first m elements denote the elements that 
    should be merged, and the last n elements are set to 0 and should be ignored. 
    nums2 has a length of n.

 */

import java.util.Arrays;

public class Question5 {
    public static void main(String[] args) {
      int [] num1={1,2,3};  
      int [] num2={2,5,6};
      Question5 q=new Question5();
      int [] a=q.Solution(num1, num2);
      Arrays.sort(a);
       for (int i : a) {
         System.out.print("*"+i+"*");
       }
    }
    int[] Solution(int[]num1,int[]num2){
        int i=0;
        int j=0;
          int []a=new int[num1.length+num2.length];
          for(i=0;i<num1.length;i++){
            a[i]=num1[i];
          }
          for( j=0;j<num2.length;j++){
            a[i+j]=num2[j];
          }
        return a;
    }
}
