/*
 * 5. Demonstrate the difference between abstract class and interface by writing programs
     as well as in keypoints.
 */
/* 
   1.Two keywords abstract and class are used to define an abstract class.
   2. To inherit the abstract class, we use the extends keyword.
   3.Abstract class can have final, non-final, static, and non-static variables.
   4. The abstract class variable does not require performing initialization at the
          time of declaration.
   5. An abstract class can have both abstract and non-abstract (concrete)
      methods.
   6.Since an abstract class can have instance variables. Therefore, we can
        define constructors within the abstract class to initialize instance variables.
*/
abstract class AbstractClass{
	
	int a;//Not required Initialization
	final int b=20;//Final Variable
	static int c=30;//Static Variable
	
	abstract void m1();//abstract method
	static void m2() {
		System.out.println("Static method in Abstract Class...");
	}
	
	void m3() {
		System.out.println("Instance Method In Abstract Class.....");
	}
	// Declaration of constructors to initialization of instance variable
	AbstractClass(){
		a=10;
		System.out.println("Value of a::"+a);
	}
	static {System.out.println("Static block in Abstract Class...");}
	{System.out.println("Instance Block in Abstract Class....");}
	
	private void m4() {System.out.println("Private method in Abstract Class");}
	protected void m5() {System.out.println("Protected method in Abstract Class");}
	
}
 class A extends AbstractClass{

	@Override
	void m1() {
		System.out.println("implementation of Abstract Method");
	}
	 
 }
public class TestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          A a = new A();
          System.out.println("Value of b is::"+a.b);
          System.out.println("Value of c is::"+AbstractClass.c);
          a.m1();
          AbstractClass.m2();
          a.m3();
          a.m5();
	}

}
