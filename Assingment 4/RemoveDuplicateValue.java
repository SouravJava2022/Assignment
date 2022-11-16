//1. WAP to remove Duplicates from a String.
//(Take any String ex with duplicates character)

public class RemoveDuplicateValue {

	public static void main(String[] args) {
		String s1="SOUOURARAV";
		char[]a = s1.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			int count=0;
		
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count ++;
				}
			}
			if(count==0) {
				System.out.print(a[i]+" ");
			}
		}
	}

}
