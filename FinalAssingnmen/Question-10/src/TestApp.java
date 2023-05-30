import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

/*
 * 10. Write a Java program that reads a set of integers from the user and stores them in a
    List. The program should then find the second largest and second smallest elements
     in the List.

 */

public class TestApp  {
	 static LinkedList<Integer> list;
	public static void main(String[] args) {
		  list = new LinkedList();
		
		 TestApp app = new TestApp();
		 app.commonMethod();
		 
		 System.out.println("//////////////////"+list);
		 
		 Collections.sort(list);
		 System.out.println("Final List::"+list);
		 if(list.size()==1) {
			 System.out.println("Second Smallest Element::"+list.get(0));
			 System.out.println("Second Largest Element::"+list.get(0));
		 }
		 else if(list.size()==2) {
			 System.out.println("Second Smallest Element::"+list.get(1));
			 System.out.println("Second Largest Element::"+list.get(1));
			 
		 }
		 else {
			 
			 System.out.println("Second Smallest Element::"+list.get(1));
			 Integer last = list.getLast();
			 int indexOf = list.indexOf(last);
			 Integer integer = list.get(indexOf-1);
			 System.out.println("Second Largest Element::"+integer);
		 }
	}
	
	int commonMethod() {
		
		
		 //List list = new ArrayList();
		Scanner scan=new Scanner(System.in);
		System.out.println("Please Enter The Value");
		int i = scan.nextInt();
		list.add(i);
		System.out.println(list);
		//commonMethod2();
		//Scanner scan=new Scanner(System.in);
		System.out.println("Are you want to continue Y/N");
		String string = scan.next();
		if(string.equalsIgnoreCase("y")) {
			int j = commonMethod();
		return j;
		}
		else {
			System.out.println("***********"+list);
			return 0;
		}
	}
		
}

