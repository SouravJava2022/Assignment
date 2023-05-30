/*
 * 3. Write a Java programme that takes an integer from the user and throws an exception
   if it is negative.Demonstrate Exception handling of same program as solution.

 */
import java.util.Scanner;

public class TestApp {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Give Input...");
		int i = scan.nextInt();
		try {
		int []arr=new int[i];
		System.out.println("All is Fine");
		}
		catch(NegativeArraySizeException e) {
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
