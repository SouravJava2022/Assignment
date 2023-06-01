package Assingnment2;

import java.util.Arrays;

/*
 * Question 7
An array is monotonic if it is either monotone increasing or monotone decreasing.

An array nums is monotone increasing if for all i <= j, nums[i] <= nums[j]. An array nums is
monotone decreasing if for all i <= j, nums[i] >= nums[j].

Given an integer array nums, return true if the given array is monotonic, or false otherwise.

 */
public class Question7{
    public static void main(String[] args) {
        int [] a={1,2,2,3};
    
        int n=a.length;
        
       boolean b= Solution(a, n);
       System.out.println(b);
    }
    public static boolean Solution(int [] a,int n){
        return incre(a, n) || decrease(a, n);
}
public static boolean incre(int [] a,int n){
      for(int i=0;i<n-1;++i)
        if(a[i]>a[i+1]) return false;
      
    return true;   
}
public static boolean decrease(int [] a,int n){
    for(int i=0;i<n-1;++i)
      if(a[i]< a[i+1])  return false;
      
      return true;   
    
}
}