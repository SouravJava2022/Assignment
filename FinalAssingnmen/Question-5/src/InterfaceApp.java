/* 
 *               Interface Keypoints Below------>
 * 
 1.Only one keyword interface is used to define an interface.
 2.To implement an interface, we can use the implements keyword.
 3.Interface cannot have any instance variables. It can have only static
      variables.
 4.Interface variable must be initialized at the time of declaration otherwise
       we will get compile-time error.
 5.Every method present inside an interface is always public and abstract,
    whether we are declaring or not. That’s why interface is also known as a pure (100%) abstract class
*/
interface II1{// One keyword: interface.
	int x=2;// Interface variable must be initialized at the time of declaration.
	//By default, interface variable is public, static, and final. 
	public abstract void A1();// // By default, interface method is public and abstract. 
	// Here, we cannot declare instance variables, instance methods, constructors,
	//static, and non-static block.
}
 interface II2{
	 int y=30;
	 void A2();
 }
 class II1Impl implements II1,II2{//Multiple Inheritance

	@Override
	public void A1() {
		System.out.println("Value of x is::"+x);
		System.out.println("This is A1()");
		
	}

	@Override
	public void A2() {
		System.out.println("value of y is::"+y);
		System.out.println("This is A2()");
	}
	
}
public class InterfaceApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            II1Impl impl = new II1Impl();
            impl.A1();
            impl.A2();
	}

}
