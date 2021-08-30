package JavaCollection;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Java2_1_15 {
	public static void main(String[] args) {
		/*IntStream stream = IntStream.of(1, 4, 7, 8, 9, 6, 3, 2, 5);
		OptionalDouble obj = stream.average();
		if (obj.isPresent()) {
			System.out.println(obj.getAsDouble());
		} else {
			System.out.println("-1");
		}*/
 List<Integer> lst = new ArrayList<Integer>();
 lst.add(3);
 lst.add(5);
 lst.add(6);
 lst.add(2);
 double  kq=  lst.stream().mapToInt(a->a).average().getAsDouble();
 System.out.println(kq);
	}
}
