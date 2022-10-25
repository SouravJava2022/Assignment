
public class INEURON {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int n=10;
           for(int i=0;i<n;i++)
           {
        	   //loop for I
        	   for(int j=0;j<n;j++)
        	   {
        		   if(j==(n-1)/2)
        		   {
        			   System.out.print("*");
        		   }
        		   else
        		   {
        			   System.out.print(" ");
        		   }
                   }
        	   for(int j=0;j<n;j++)
        	   {
        		   //loop for N
        		   if((j==0) || (i==j) || (j==n-1 && i<n-1))
        		   {
        			   System.out.print("*");
        		   }
        		   else
        		   {
        			   System.out.print(" ");
        		   }
                   }
        	   for(int j=0;j<n;j++)
        	   {
        		   // loop for E
        		   if(j==(n-1)/8 ||
        				   i==0 && j>(n-1)/8 ||
        				   i==n-1 && j>(n-1)/8 ||
        				   i==(n-1)/2 && j>(n-1)/8)
        		   {
        			   System.out.print("*");
        		   }
        		   else
        		   {
        			   System.out.print(" ");
        		   }
                   }
        	   for(int j=0;j<n;j++)
        	   {
        		   //loop for U
        		   if((j==(n-1)/8 && i<n-1) || (i==n-1 && j>(n-1)/8 && j<n-1) || (j==n-1 && i<n-1))
        		   {
        			   System.out.print("*");
        		   }
        		   else
        		   {
        			   System.out.print(" ");
        		   }
                   }
        	   for(int j=0;j<n;j++)
        	   {
        		   // loop for R
        		   if((j==(n-1)/4 && i>0) || (i==0 && j>(n-1)/4 && j<n-1) ||
        				   (i==(n-1)/2 && j>(n-1)/4 && j<n-1) ||
        				   (j==n-1 && i>0 && i<(n-1)/2) ||
        				   (i>=n/2 && j==i))
        		   {
        			   System.out.print("*");
        		   }
        		   else
        		   {
        			   System.out.print(" ");
        		   }
                   }
        	   for(int j=0;j<n;j++)
        	   {
        		   //loop for O
        		   if((j==(n-1)/4 && i>0 && i<n-1) ||
        				   (i==n-1 && j>(n-1)/4 && j<(n-2)) ||
        				   (j==(n-2) && i>0 && i<n-1) ||
        				  (i==0 && j>(n-1)/4 && j<n-2) )
        		   {
        			   System.out.print("*");
        		   }
        		   else
        		   {
        			   System.out.print(" ");
        		   }
                   }
        	   for(int j=0;j<n+i;j++)
        	   {
        		   // loop for N
        		   if(j==0 || i==j  || j==n-1)
        				  
        		   {
        			   System.out.print("*");
        		   }
        		   else
        		   {
        			   System.out.print(" ");
        		   }
                   }
        	   System.out.println();
           }
	}

}


