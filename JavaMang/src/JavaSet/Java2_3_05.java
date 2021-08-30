package JavaSet;

import java.util.HashSet;

public class Java2_3_05 {
	public static void main(String[] args) {
		HashSet<Integer> set1 = new HashSet<Integer>();
		set1.add(1);
		set1.add(2);
		set1.add(5);
		set1.add(0);
		set1.add(6);
		set1.add(7);
		HashSet<Integer> set2 = new HashSet<Integer>();
		set2.add(0);
		set2.add(9);
		set2.add(7);
		set2.add(5);
		set2.add(3);
		set2.add(8);
		set1.retainAll(set2);
		System.out.println("hop cua hai set la: "+set1);

	}
}
