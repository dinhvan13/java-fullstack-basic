package JavaCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Java2_2_04 {
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
		Collections.swap(T, 0, 2);
		System.out.println("list t dao nguoc la:" + T);
	}
}
