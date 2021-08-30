package JavaCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Java2_2_10 {
	public static void main(String[] args) {
		List<Integer> listT = new ArrayList<Integer>();
		listT.add(1);
		listT.add(4);
		listT.add(7);
		listT.add(8);
		listT.add(9);
		listT.add(6);
		listT.add(3);
		listT.add(2);
		listT.add(5);
		for (int i = 0; i < listT.size(); i++) {
			System.out.println(i + "-" + listT.get(i));
		}
	}
}
