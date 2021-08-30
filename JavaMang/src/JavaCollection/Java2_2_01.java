package JavaCollection;

import java.util.ArrayList;
import java.util.List;

public class Java2_2_01 {
	public static void main(String[] args) {
		List<Integer> listT = new ArrayList<Integer>();
		listT.add(1);
		listT.add(4);
		listT.add(7);
		listT.add(8);
		listT.add(9);
		listT.add(6);
		listT.add(3);
		listT.add(2);
		listT.add(5);
		listT.remove(3);
		System.out.println("list t sau khi xoa phan tu thu 3 :" + listT);
	}
}
