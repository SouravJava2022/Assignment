//4. WAP to count the number of consonants, vowels, special characters in a String.
public class VowelsConsonentsSpecialCharacter {
public static void main(String[] args) {
	   String s1="SOURAV!@#$%^&*123456789";
	   char [] a=s1.toCharArray();
	   int vowels=0;
	   int consonents=0;
	   int digit=0;
	   int sc=0;
	   for(int i=0;i<s1.length();i++)
	   {	
		   char s2 = a[i];
		   if((s2>='a' && s2<='z') || (s2>='A' && s2<='Z')) {
		   if((s2=='a' || s2=='e' || s2=='i' || s2=='o' || s2=='u')||
			(s2=='A' || s2=='E' || s2=='I' || s2=='O' || s2=='U'))
		   {
//			   System.out.println(" Vowels index is"+" "+i);
			   vowels++;
		   }
		   else
		   {
//			System.out.println("Consonents index is"+" "+i);
			   consonents++;
		   }
		   }
		   else if(s2>='0' && s2<='9')
		 {
//			  System.out.println("Digit");
				digit++;
		 }
			   else {
				   sc++;
			   }
		   
	   }
	   
	   System.out.println("The Number Of Vowels is"+" "+vowels);
	   System.out.println("The Number Of Consonents is"+" "+consonents);
	   System.out.println("The Number of digit is"+" "+digit);
	   System.out.println("The Number of Special Character is"+" "+sc);
	}

}
