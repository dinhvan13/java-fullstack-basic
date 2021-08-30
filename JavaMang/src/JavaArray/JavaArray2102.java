package JavaArray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JavaArray2102 {
	public static void main(String[] args) {
		List<String> monHoc = new ArrayList<String>();
		monHoc.add("toan");
		monHoc.add("ly");
		monHoc.add("hoa");
		monHoc.add("van");
		monHoc.add("anh");
		monHoc.add("toan cao cap");
		monHoc.add("sinh hoa");
		Collections.replaceAll(monHoc, "toan", "test");
		System.out.println(monHoc);

	}
}
