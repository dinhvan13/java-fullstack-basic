package JavaSet;

import java.util.HashSet;

public class Java2_3_03 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("cam");
		set.add("quyt");
		set.add("mit");
		set.add("dua");
		set.add("le");
		set.add("tao");
		set.add("oi");
		if (set.isEmpty()) {
			System.out.println("set tren rong");
		} else {
			System.out.println("set tren khong rong");
		}
	}
}
