/*
 * 2. Write a Java program to invoke parent class constructor from a child class. Create
   Child class object and parent class constructor must be invoked. Demonstrate by
   writing a program. Also explain key points about Constructor
 */

/*
    >>>>Constractor Key Point Below
    1.The name of the constructor must be the same as that of the class name in which it resides.
    2.Constructors must not have a return type. If you keep the return type for the constructor, it will be
           treated as a method.
    3.Every class should have at least one constructor. If you don’t write a constructor for your class, the
              compiler will give a default constructor.
    4.A constructor in Java cannot be abstract, final, static, and Synchronized.
    5.Access modifiers can be used in constructor declaration to control its access i.e which other class can
          call the constructor.       



*/
class SuperClass{
	SuperClass(){
		System.out.println("This Is Parent Class Constractor.......");
	}
}
class SubClass extends SuperClass{
	SubClass(){
		super();
		System.out.println("This is subClass Constractor........");
	}
}
public class TestApp {

	public static void main(String[] args) {
		new SubClass();

	}

}
