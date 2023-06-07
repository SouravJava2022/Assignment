package Assingnment5;
/*
 * <aside>
💡 **Question 5**

Given two integer arrays arr1 and arr2, and the integer d, *return the distance value between the two arrays*.

The distance value is defined as the number of elements arr1[i] such that there is not any element arr2[j] where |arr1[i]-arr2[j]| <= d.

</aside>
 */
public class Question5 {
    public static void main(String[] args) {
       int[] arr1 ={4,5,8};
       int[] arr2 ={10,9,1,8};
       int d =2;

       
         
       for (int i = 0; i < arr1.length; i++) {
          for (int j = 0; j < arr2.length; j++) {
            
            int k=Math.abs(arr1[i]-arr2[j]);

            if(k<=d){
                System.out.println(i);
            }
          }
       }
    }
}
