package JavaCollection;

import java.util.Arrays;
import java.util.List;

public class Java2_2_12 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 4, 7, 8, 9, 6, 3, 2, 5);
		int kq = list.stream().reduce(0, (subtotal, element) -> subtotal + element);
		System.out.println("tong la: " + kq);
	}
}
