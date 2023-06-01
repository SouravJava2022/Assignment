package Assingnment2;

import java.util.Arrays;

/*
 * Question 6
Given an array of integers nums which is sorted in ascending order, and an integer target,
write a function to search target in nums. If target exists, then return its index. Otherwise,
return -1.

You must write an algorithm with O(log n) runtime complexity.

 */
public class Question6{
    public static void main(String[] args) {
        int [] a={-1,0,3,5,9,12};
        Arrays.sort(a);
        int n=a.length;
        int key=9;
       int b= Solution(a, n,key);
       System.out.println(b);
    }
    public static int Solution(int [] a,int n, int key){
        int low=0;
        int high=n-1;
        while (low<=high) {
            int mid=(low+high)/2;
            if(key==a[mid]){
                return mid;
            }
            else if (key<a[mid]) {
                high=mid-1;
            }
            else if (key>a[mid]) {
                low=mid+1;
            }
        }
        return -1;
}
}