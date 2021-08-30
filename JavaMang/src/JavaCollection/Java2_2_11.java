package JavaCollection;

import java.util.ArrayList;
import java.util.List;

public class Java2_2_11 {
	public static void main(String[] args) {
		List<Integer> listT = new ArrayList<Integer>();
		listT.add(1);
		listT.add(2);
		listT.add(7);
		listT.add(1);
		listT.add(1);
		listT.add(6);
		listT.add(3);
		listT.add(2);
		listT.add(5);

		for (int i = 0; i < listT.size(); i++) {
			int dem = 0;
			System.out.print(listT.get(i) + " - ");
			for (int j = 0; j < listT.size(); j++) {
				if (listT.get(i) == listT.get(j)) {
					dem++;
				}
			}
			System.out.println(dem);

		}

	}
}
