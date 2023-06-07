package Assingnment11;
/*
 * Given a non-negative integer x, return the square root of x rounded down to the 
 * nearest integer. The returned integer should be non-negative as well
 */
public class Question1 {
    public static void main(String[] args) {
        int x=8;
     System.out.println(Solution(x));
    }
    
    private static int Solution(int x) {
        int l=1;
        int r=x,ans=0;
    
        while (l<=r) {
            int mid=l+(r-l)/2;
            if(x/mid==mid) return mid;
            else if (x/mid<mid) {
                r=mid-1;
            }
            else{
                l=mid+1;
             ans = mid;
            }
            
        }
        return ans;

    }
}
