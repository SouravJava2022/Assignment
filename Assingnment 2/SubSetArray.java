//6. WAP to check whether an array is a subset of another array

import java.util.Arrays;

public class SubSetArray{
    public static void main(String[] args) {
        int [] a1={10,2,5,15,30,21,24};
        int [] a2={15,30,24,21,2};
            Arrays.sort(a1);
            for (int i : a1) {
                System.out.print(i+" ");
            }
          System.out.println();
            Arrays.sort(a2);
           
            int m=a1.length;
            int n=a2.length;
          

            if(isSubset(a1, a2, m, n))
            System.out.println("a2[] is subset of array a1[]");
            else
            System.out.println("a2[] is not subset of array a1[]");
        }

        public static boolean isSubset(int [] a1,int [] a2,int m,int n){
             for (int i=0;i<n;i++) {
              if (Arrays.binarySearch(a1, a2[i])<0) {
                return false;
              }
             }
          return true;
        }
}