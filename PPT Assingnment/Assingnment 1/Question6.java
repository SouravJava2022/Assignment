/*
 * 
    💡 **Q6.** Given an integer array nums, return true if any value appears at least
         twice in the array, and return false if every element is distinct.
 */
public class Question6 {
    public static void main(String[] args) {
        int num []={1,2,3,1};
        int n=num.length;
        boolean b=Solution(num, n);
        System.out.println(b);
    }
    static boolean Solution(int[]a,int n){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]==a[j])
                   return true;
            }
        }
        return false;
    }

}
