package in.deb;

public class Q3 {
	public static void printArray(int arr[], int N)
	{
	     
	  
	    for(int i = 0; i < N; i++)
	    {
	       System.out.print(arr[i] + " ");
	    }
	}
	     
	
	public static void sortArray(int arr[], int N)
	{
	 
	    // Traverse the array
	    for(int i = 0; i < N;)
	    {
	 
	       // If the current element is
	       // at correct position
	       if (arr[i] == i + 1)
	       {
	           i++;
	       }
	        
	     
	       else
	       {
	           int temp1 = arr[i];
	           int temp2 = arr[arr[i] - 1];
	           arr[i] = temp2;
	           arr[temp1 - 1] = temp1;
	       }
	    }
	}
	 
	// Driver Code   
	public static void main(String[] args)
	{
	    int arr[] = { 2, 1, 5, 3, 4 };
	    int N = arr.length;
	 
	    
	    sortArray(arr, N);
	 
	    
	    printArray(arr, N);
	}

}