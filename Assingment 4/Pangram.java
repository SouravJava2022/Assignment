//6. WAP to implement Pangram Checking with least inbuilt methods being used.
public class Pangram {
   public static void main(String[] args) {
         String s1="THE QUICK BROWN fox JUMPS OVER THE LAZY DOg";
      String   s2=s1.replace(" ","");
    String s3="";
    boolean flag=false;
         System.out.println(s2);
         ////
         for(int i=0;i<s2.length();i++) {
        	 if(s2.charAt(i)>='A' && s2.charAt(i)<='Z') 
        	 {
        		 s3=s3+(char)(s2.charAt(i)+32);
        	 }
        	 else {
        		 s3=s3+(char)(s2.charAt(i));
        	 }
         }
         System.out.println(s3);
         /////
         char [] a=s3.toCharArray();
          int []ar=new int[26];
        //////
          for(int i=0;i<a.length;i++) {
        	  int index=a[i]-97;
        	  ar[index]++;
          }
      
       for(int i=0;i<ar.length;i++) {
    	   if(ar[i]==0) {
    		   System.out.println("It is not a Pangram");
    		   flag=true;
    	   }   
       }
       if(flag==false) {
    	   System.out.println("It is a Pangram");
       }
	}

}
