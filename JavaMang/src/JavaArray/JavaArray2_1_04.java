package JavaArray;

import java.util.ArrayList;
import java.util.List;

public class JavaArray2_1_04 {
	public static void main(String[] args) {
		List<String> arrList = new ArrayList<String>();
		arrList.add("Toan");
		arrList.add("Ly");
		arrList.add("Hoa");
		arrList.add("Van");
		arrList.add("Anh");
		arrList.add("Toan Cao Cap");
		arrList.add("Sinh Hoa");
		arrList.toArray();
		// System.out.print(arrList);
		for (String i : arrList) {
			System.out.println(i + " ");
		}

	}
}
