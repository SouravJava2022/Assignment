package Assingnment4;
/*
 * Question 1
Given three integer arrays arr1, arr2 and arr3 sorted in strictly increasing order, return a sorted array of only the integers that appeared in all three arrays.
 
 */
public class Question1 {
    public static void main(String[] args) {
       int [] arr1 = {1,2,3,4,5}, arr2 = {1,2,5,7,9}, arr3 = {1,3,4,5,8};

       Solution(arr1,arr2,arr3);
    }

    private static void Solution(int[] arr1, int[] arr2, int[] arr3) {
        int i=0;int j=0;int k=0;

        while (i<arr1.length && j<arr2.length && k<arr3.length) {
            
            if(arr1[i]==arr2[j] && arr2[j]==arr3[k]){
                System.out.println(arr1[i]+" ");

                i++;
                j++;k++;
            }
            else if(arr1[i]<arr2[j]){
                i++;
            }
            else if(arr2[j]<arr3[k]){
                j++;
            }
            else{
                k++;
            }
        }
    }
}
