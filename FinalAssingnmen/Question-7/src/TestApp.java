/*
 * 7. Create a Java program that implements a binary search algorithm. The program
    should accept user input for the target value and search for it in a sorted array. The
     program should return the index of the target value if found or a message if not
      found.
 */

import java.util.Arrays;
import java.util.Scanner;

interface searchBinary{
	  void  binary(int a,int [] b);
  }
public class TestApp implements searchBinary {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter a number which is search::");
		int i = scan.nextInt();
		
		int [] b= {10,20,30,60,50,70,80};
		Arrays.sort(b);
		TestApp app = new TestApp();
		app.binary(i,b);
	}

	@Override
	public  void binary(int a,int [] b) {
		int low=0;
		int high=b.length-1;
		
		while(low<=high) {
			int mid=(low+high)/2;
			if(a==b[mid]) 
			{
				System.out.println("Key::"+a+"found At index::"+mid);
				break;
			}
			else if(a<b[mid]) {
				high=mid-1;
			}
			else if(a>b[mid]) {
				low=mid+1;
			} 
		}
		if(low>high) {
			System.out.println("Key Not Found");
		}
	}

}
