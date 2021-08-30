package JavaCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Java2_2_13 {
	public static void main(String[] args) {
		List<String> hoaqua = new ArrayList<String>();
		hoaqua.add("cam");
		hoaqua.add("quyt");
		hoaqua.add("mit");
		hoaqua.add("dua");
		hoaqua.add("dua");
		hoaqua.add("le");
		hoaqua.add("tao");
		hoaqua.add("oi");
		Collections.sort(hoaqua);
		System.out.println("collection sau khi sap xep :" + hoaqua);

	}

}
