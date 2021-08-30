package JavaCollection;

import java.util.ArrayList;
import java.util.List;

public class Java2_2_14 {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);

		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(12);
		list2.add(122);
		list2.add(3);
		list2.add(4);
		list1.retainAll(list2);
		System.out.println("Phan tu trung nhau: " + list1);

	}
}
