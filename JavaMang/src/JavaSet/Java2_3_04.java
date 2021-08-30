package JavaSet;

import java.util.HashSet;

public class Java2_3_04 {
	public static void main(String[] args) {
		HashSet<Integer> set1 = new HashSet<Integer>();
		set1.add(1);
		set1.add(3);
		set1.add(8);
		set1.add(7);
		HashSet<Integer> set2 = new HashSet<Integer>();
		set2.add(3);
		set2.add(4);
		set2.add(3);
		set2.add(1);
		set2.add(2);
		set2.add(6);
		set1.remove(1);
		set2.remove(1);

		System.out.println(set1);
		System.out.println(set2);
		set1.removeAll(set2);
		System.out.println(set1);
		set1.clear();
		set2.clear();
		System.out.println(set1);
		System.out.println(set2);
	}
}
