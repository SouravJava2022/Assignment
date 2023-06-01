package Assingnment2;

import java.util.Arrays;

/*
 * Question 5
Given an integer array nums, find three numbers whose product is maximum and return the maximum product.
 */
public class Question5{
    public static void main(String[] args) {
        int [] a={1,2,3,4};
        Arrays.sort(a);
        int n=a.length;
       int b= Solution(a, n);
       System.out.println(b);
    }
    public static int Solution(int [] a,int n){
        int res=0;
        for(int i=0;i<n;i++){
        res=   Math.min(a[0]*a[1]*a[2],a[n-1]*a[n-2]*a[n-3]);
 }
        return res;
}
}