package JavaSet;

import java.util.HashSet;

public class Java2_3_01 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("one");
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("four");
		set.add("four");
		System.out.println(set);
	}
}
