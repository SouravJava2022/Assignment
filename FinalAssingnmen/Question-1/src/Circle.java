
public class Circle implements Shape {
      int radious=10;
      double pivalue=3.14;
	@Override
	public void area() {
		System.out.println("Area of circle is::"+(pivalue*(radious*radious)));
	}

	@Override
	public void perimeter() {
		System.out.println("Perimeter Of Circle is::"+(2*(pivalue)*radious));

	}

}
