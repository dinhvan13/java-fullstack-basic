package JavaSet;

import java.util.HashSet;

public class Java2_3_06 {
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(1);
		set.add(3);
		set.add(3);
		set.add(4);
		set.add(3);
		set.add(5);
		set.add(5);
		System.out.println(set);
		if (set.isEmpty()) {
			System.out.println("set tren rong");
		} else {
			System.out.println("set tren khong trong");
		}

	}
}
