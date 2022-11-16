//7. WAP to find if String contains all unique characters.
public class UniqueCharacter {
      public static void main(String[] args) {
		String s2="SOURAV123456";
		String s1="";
		  for(int i=0;i<s2.length();i++) 
		  {
			  if(s2.charAt(i)>='a' && s2.charAt(i)<='z')
			  {
				  s1=s1+(char)(s2.charAt(i)-32);
			  }
			  else 
			  {
				  s1=s1+(char)(s2.charAt(i));
			  }
		  }
		char [] ch=s1.toCharArray();
	    int count=ch.length;
	    int duplicate=0;	 
		for(int i=0;i<ch.length;i++)
		{
			for (int j=i+1;j<ch.length;j++) 
			{
				if(ch[i]==ch[j]) 
				{
					
					duplicate++;
				}
			}
		}
		if(duplicate==0) {
			System.out.println("All Character is Unique");
		}
		else {
			System.out.println("Is not Unique");
		}

	}

}
