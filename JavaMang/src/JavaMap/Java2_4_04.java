package JavaMap;

import java.util.Map;
import java.util.TreeMap;

public class Java2_4_04 {
	public static void main(String[] args) {
		TreeMap<Integer, String> treemap = new TreeMap<Integer, String>();
		treemap.put(2, "tao");
		treemap.put(5, "cam");
		treemap.put(4, "quyt");
		treemap.put(3, "le");
		for (Map.Entry<Integer, String> x : treemap.entrySet()) {
			System.out.println(x.getKey() + "->" + x.getValue());
		}

	}
}
