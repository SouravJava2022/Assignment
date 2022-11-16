import java.util.Arrays;

//5. WAP to implement Anagram Checking least inbuilt methods being used.
public class Anagram {
  public static void main(String[] args) {
          String s1="RaCe";
          String s2="";
          String s3="CaRe";
          String s4="";
          //upper to lower
          for(int i=0;i<s1.length();i++)
          {
        	  if(s1.charAt(i)>='A' && s1.charAt(i)<='Z') 
        	  {
        	  s2=s2+(char)(s1.charAt(i)+32);
        	  }
        	  else 
        	  {
        		  s2=s2+(char)(s1.charAt(i));
        	  }
          }
          System.out.println(s2);
          System.out.println();
          ///////
         for(int i=0;i<s3.length();i++) {
        	 if(s3.charAt(i)>='A' && s3.charAt(i)<='Z') {
        		 s4=s4+(char)(s3.charAt(i)+32);
        	 }
        	 else {
        		 s4=s4+(char)(s2.charAt(i));
        	 }
         }
          //String to Array Transfer
          
          char [] ch2=s2.toCharArray();
          char [] ch3=s4.toCharArray();
          
        //sorting of Array ch2
          
          for (int i=0;i<ch2.length;i++) 
          {
        	  for(int j=1;j<ch2.length;j++) 
            {
        		  if(ch2[j]<ch2[j-1]) 
              {
        			  char tempvar=ch2[j-1];
        			  ch2[j-1]=ch2[j];
        			  ch2[j]=tempvar;
        		  }
        	  }
          }
         for( char ele1:ch2) {
        	 //System.out.print(ele1);
         }
         System.out.println(ch2);
         System.out.println();
         //sorting of Array ch3
         for(int i=0;i<ch3.length;i++) 
         {
        	 for(int j=1;j<ch3.length;j++) 
           {
        		 if(ch3[j]<ch3[j-1]) 
             {
        			 char tempvar=ch3[j];
        			 ch3[j]=ch3[j-1];
        			 ch3[j-1]=tempvar;
        		 }
        	 }
         }
         for(char ele:ch3) {
        	 //System.out.print(ele);
         }
       System.out.println(ch3);
       System.out.println();
       ////condition
       if(Arrays.equals(ch2, ch3))
       {
    	   System.out.println("It is Anagram");
       }
       else
       {
    	   System.out.println("It is not Anagram");
       }
	}

}
