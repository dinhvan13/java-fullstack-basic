package JavaArray;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class JavaArray2_1_10 {
	public static void main(String[] args) {
		List<Integer> arrList = new ArrayList<>();
		arrList.add(1);
		arrList.add(4);
		arrList.add(7);
		arrList.add(8);
		arrList.add(9);
		arrList.add(6);
		arrList.add(3);
		arrList.add(2);
		arrList.add(5);
		ListIterator<Integer> arr = arrList.listIterator();
		System.out.println("collection ban dau la: ");
		while (arr.hasNext()) {
			System.out.print(arr.next() + " ");
		}
		System.out.println("collection dao  nguoc  la: ");
		while (arr.hasPrevious()) {
			System.out.print(arr.previous() + " ");

		}

	}
}
