package JavaHam;

import java.util.Arrays;
import java.util.List;

public class Java3118 {
	public static Integer TimPhanTuDauTien(List<Integer> lst) {
		for (Integer number : lst) {
			if (number % 2 == 0)
				return number;

		}
		return null;
	}

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(0, 2, 4, 6, 8, 3, 5);
		System.out.println("phan tu chan dau tien trong mang la: " + TimPhanTuDauTien(list));
	}
}
