package JavaArray;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class JavaArray2_1_05 {
	public static void main(String[] args) {
		List<String> dsMonHoc = new ArrayList<String>();
		dsMonHoc.add("toan");
		dsMonHoc.add("ly");
		dsMonHoc.add("hoa");
		dsMonHoc.add("van");
		dsMonHoc.add("anh");
		dsMonHoc.add("toan cao cap");
		dsMonHoc.add("sinh hoa");
		Iterator<String> ds = dsMonHoc.iterator();
		while (ds.hasNext()) {
			System.out.println(ds.next());
		}

	}
}
