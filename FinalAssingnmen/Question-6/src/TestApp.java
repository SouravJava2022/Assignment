import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * 6. Write a Java program that uses stream api to perform operations on a large data set,
     such as sorting or filtering the data.
 */
public class TestApp {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList();
		list.add(10);
		list.add(80);
		list.add(50);
		list.add(30);
		list.add(70);
		list.add(25);
		list.add(65);
        List<Integer> stream = list.stream().sorted().collect(Collectors.toList());
        stream.forEach(n->System.out.println("Sorted List Using Stream Api::"+n));
        
        System.out.println("******************");
        Stream<Integer> filter = list.stream().filter(n->(n%2)==0);
        filter.forEach(m->System.out.println("Filter List Using Stream Api::"+m));
        
	}

}
