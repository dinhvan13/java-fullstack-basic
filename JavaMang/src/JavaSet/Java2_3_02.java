package JavaSet;

import java.util.HashSet;

public class Java2_3_02 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("cam");
		set.add("quyt");
		set.add("mit");
		set.add("dua");
		set.add("le");
		set.add("tao");
		set.add("oi");
		String s = "jokdk";
		if (set.contains(s)) {
			System.out.println("chuoi s chua trong set");
		}
		else
		{
			System.out.println("chuoi s khong chua trong set");
		}

	}
}
