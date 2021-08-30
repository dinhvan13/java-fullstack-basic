package JavaCollection;

import java.util.ArrayList;
import java.util.List;

public class Java2_2_08 {
	public static void main(String[] args) {
		List<Integer> listT = new ArrayList<Integer>();
		listT.add(2);
		listT.add(4);
		listT.add(7);
		listT.add(9);
		listT.add(3);
		listT.add(2);
		listT.add(5);
		//System.out.println(listT);

		int gtln = TimGiaTriLonNhat(listT);
		System.out.println("GTLN: " + gtln);
		int gtnn = TimGiaTriNhoNhat(listT);
		System.out.println("GTNN: " + gtnn);
	}

	public static int TimGiaTriLonNhat(List<Integer> lst) {
		int max = lst.get(0);
		//System.out.println(max);
		for (int i = 1; i < lst.size(); i++) {

			if (max < lst.get(i)) {
				max = lst.get(i);
			}

		}
		return max;
	}

	public static int TimGiaTriNhoNhat(List<Integer> lst) {
		int min = lst.get(0);
		for (int i = 1; i < lst.size(); i++) {

			if (min > lst.get(i)) {
				min = lst.get(i);
			}

		}
		return min;
	}
}
