//2. WAP to print Duplicates characters from the String.
public class DuplicateCharacter {
	public static void main(String[] args) {
		String s1="SACHINIA";
		char []ch1=s1.toCharArray();
		for(int i=0;i<ch1.length;i++)
		{
			for(int j=i+1;j<ch1.length;j++)
			{
				if(ch1[i]==ch1[j])
				{
					System.out.println("Duplicate found of a character "+ch1[i]+" "+"at index of "+j);
				}
			}
		}
	}

}
