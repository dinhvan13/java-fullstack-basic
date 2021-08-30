package JavaArray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JavaArray2_1_09 {
	public static void main(String[] args) {
		List<String> hoaQua = new ArrayList<String>();
		hoaQua.add("cam");
		hoaQua.add("quyt");
		hoaQua.add("mit");
		hoaQua.add("dua");
		hoaQua.add("dua");
		hoaQua.add("le");
		hoaQua.add("tao");
		hoaQua.add("oi");
		Collections.sort(hoaQua);
		System.out.println(hoaQua);
	}
}
