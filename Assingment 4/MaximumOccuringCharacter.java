//8. WAP to find the maximum occurring character in a String.
public class MaximumOccuringCharacter {
    public static void main(String[] args) {
		    String s1="STUDENT CLASSMATE";
		    s1=s1.replace(" ", "");
		    String s2="";
		    for(int i=0;i<s1.length();i++)
		    {
		    	if(s1.charAt(i)>='a' && s1.charAt(i)<='z')
		    	{
		    		s2=s2+(char)(s1.charAt(i)-32);
		    	}
		    	else
		    	{
		    		s2=s2+(char)(s1.charAt(i));
		    	}
		    }
                   System.out.println(s2);
                ////////
                   int [] ar=new int[256];
                   for(int i=0;i<s2.length();i++) 
                   {
                	   ar[s2.charAt(i)]++;
                   }
                   int max=0;
                   char result=' ';
                   for(int i=0;i<s2.length();i++)
                   {
                	   if(max<=ar[s2.charAt(i)])
                	   {
                		   max=ar[s2.charAt(i)];
                		   result=s2.charAt(i);
                	   }
                   }
                   System.out.println("Maximum Occuring Character is"+" "+result);
    	   }
       }
       
	


