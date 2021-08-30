package JavaHam;

import java.util.ArrayList;
import java.util.List;

public class Java3_1_17 {
	public static List<Integer> XoaPhanTuLeTrongMang(List<Integer> lst) {
		lst.removeIf(x -> x % 2 != 0);
		return lst;
	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(1);

		XoaPhanTuLeTrongMang(list);
		System.out.print("mang sau khi xoa cac phan tu co gia tri le: " + list);
	}
}
