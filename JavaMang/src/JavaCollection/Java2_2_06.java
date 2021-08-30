package JavaCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Java2_2_06 {
	public static void main(String[] args) {
		List<String> lst1 = new ArrayList<String>();
		lst1.add("1");
		lst1.add("2");
		lst1.add("3");
		lst1.add("4");

		List<String> lst2 = new ArrayList<String>();
		lst2.add("A");
		lst2.add("B");
		lst2.add("C");
		lst2.add("D");

		Collections.copy(lst1, lst2);
		System.out.println("list 1 :" + lst1);
		System.out.println("list 2 :" + lst2);
	}
}
