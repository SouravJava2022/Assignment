
public class Tringle implements Shape {
    int tringleSideLength=10;
    int baseLength=10;
    int height=4;
	@Override
	public void area() {
		System.out.println("Area of a Tringle is::"+(0.5*baseLength*height));
	}

	@Override
	public void perimeter() {
		System.out.println("Tringle Perimeter is::"+(tringleSideLength*tringleSideLength*tringleSideLength));
	}

}
