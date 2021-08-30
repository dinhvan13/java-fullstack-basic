package JavaHam;

import java.util.ArrayList;
import java.util.List;

public class Java3_2_03 {
	public static void HienＴhi(List<String> lst) {
		System.out.println("cac phan tu trong danh sach la:");
		for (int i = 0; i < lst.size(); i++) {
			System.out.print(lst.get(i).substring(0, 1).toUpperCase() + lst.get(i).substring(1) + " ");
		}
	}

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("toan");
		list.add("van");
		list.add("anh");
		list.add("hoa");
		list.add("su");
		list.add("dia");
		HienＴhi(list);

	}
}
