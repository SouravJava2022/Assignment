
package in.deb;

public class Q7 {
	static int max_ref;
	 
   
    static int _lis(int arr[], int n)
    {
       
        if (n == 1)
            return 1;
 
       
        int res, max_ending_here = 1;
 
       
        for (int i = 1; i < n; i++) {
            res = _lis(arr, i);
            if (arr[i - 1] < arr[n - 1]
                && res + 1 > max_ending_here)
                max_ending_here = res + 1;
        }
 
        // Compare max_ending_here with the overall max. And
        // update the overall max if needed
        if (max_ref < max_ending_here)
            max_ref = max_ending_here;
 
   
        return max_ending_here;
    }
 
   
    static int lis(int arr[], int n)
    {
        // The max variable holds the result
        max_ref = 1;
 
     
        _lis(arr, n);
 
       
        return max_ref;
    }
 

    public static void main(String args[])
    {
        int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60 };
        int n = arr.length;
 
      
        System.out.println("Length of lis is "
                           + lis(arr, n));
    }

}