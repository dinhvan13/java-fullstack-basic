package JavaArray;

import java.util.ArrayList;
import java.util.List;

public class JavaArray2_1_06 {
	public static void main(String[] args) {
		List<String> TraiCay = new ArrayList<String>();
		TraiCay.add("cam");
		TraiCay.add("quyt");
		TraiCay.add("mit");
		TraiCay.add("dua");
		TraiCay.add("dua");
		TraiCay.add("le");
		TraiCay.add("tao");
		TraiCay.add("oi");
		String pt = "dua";
		System.out.println("vi tri dau tien cua phan tu dua la :" + TraiCay.indexOf(pt));
		System.out.println("vi tri cuoi cung cua phan tu dua la :" + TraiCay.lastIndexOf(pt));

	}
}
