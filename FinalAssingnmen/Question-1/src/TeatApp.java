/*
 * 1. Write a Java program that uses polymorphism by defining an interface called Shape
   with methods to calculate the area and perimeter of a shape. Then create classes
   that implement the Shape interface for different types of shapes, such as circles and
     triangles.
 */
public class TeatApp {

	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.area();
		circle.perimeter();
		Tringle tringle = new Tringle();
		tringle.area();
		tringle.perimeter();
	}

}
