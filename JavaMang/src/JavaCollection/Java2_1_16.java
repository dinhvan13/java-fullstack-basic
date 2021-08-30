package JavaCollection;

import java.util.ArrayList;
import java.util.List;

public class Java2_1_16 {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(123);
		list1.add(421);
		list1.add(723);
		list1.add(89);
		list1.add(90);
		list1.add(61);
		list1.add(33);
		list1.add(22);
		list1.add(54);
		System.out.println("cac so tang la :");
		for (int i = 0; i < list1.size(); i++) {
			if (KiemTraSoTang(list1.get(i)) == true) {
				System.out.println(list1.get(i));
			}
		}

	}

	public static boolean KiemTraSoTang(int a) {
		int tMax = a % 10;
		a = a / 10;
		while (a > 0) {
			int t = a % 10;
			if (t > tMax) {
				return false;
			} else {
				tMax = t;
				a = a / 10;
			}
		}
		return true;
	}
}
