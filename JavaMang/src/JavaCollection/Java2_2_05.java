package JavaCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Java2_2_05 {
	public static void main(String[] args) {
		List<Integer> T = new ArrayList<Integer>();
		T.add(1);
		T.add(4);
		T.add(7);
		T.add(8);
		T.add(9);
		T.add(6);
		T.add(3);
		T.add(2);
		T.add(5);
		T.add(2, 3);
		T.remove(6);
		Iterator<Integer> it = null;
		it = T.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}
}
