package Assingnment4;
/*
 * Question 6
Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Question6 {
    public static void main(String[] args) {
      int a=-4;
      System.out.println(Math.pow(a, 2));
      int [] nums ={-4,-1,0,3,10};
      Arrays.sort(args);
        //int [] n= new int[nums.length];  
        
        List <Integer> list=new ArrayList<Integer>();
        for (int i=0;i<nums.length;i++) {
            int un=(int) Math.pow(nums[i], 2.0);
            list.add(un);
        }
        
        Collections.sort(list);
      System.out.println(list);
    }
    
}
