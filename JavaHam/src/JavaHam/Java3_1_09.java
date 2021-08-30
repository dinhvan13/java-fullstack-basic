package JavaHam;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Java3_1_09 {
	public static List<String> DaoNguocChuoi(List<String> list) {
		Collections.reverse(list);
		return list;

	}

	public static void XuatChuoi(List<String> lst) {
		for (String i : lst) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Nguyen Duc Toan", "Nguyen Hoang Truong", "Nguyen Dong Khanh",
				"Nguyen Dinh Van");
		XuatChuoi(DaoNguocChuoi(list));
	}
}
