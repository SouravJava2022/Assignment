/*
 * **Q7.** Given an integer array nums, move all 0's to the end of it while maintaining
 *  the relative order of the nonzero elements.
 *
 * Note that you must do this in-place without making a copy of the array.
 */
public class Question7 {
    public static void main(String[] args) {
        int a[]={0,1,0,3,12};
         int n=a.length;
        Solution(a,n);
       for (int i : a) {
        System.out.print(" "+i);
       }
    }
      static void Solution(int a[],int n){
        int count=0;
        for(int i=0;i<n;i++)
            if(a[i] !=0)
                a[count++]=a[i];
            
                while (count<n) 
                    a[count++]=0;    
    }
}
