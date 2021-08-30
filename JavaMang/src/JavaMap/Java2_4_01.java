package JavaMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Java2_4_01 {
	public static void main(String[] args) {
		HashMap<String, String> hashmap = new HashMap<>();
		hashmap.put("viet nam", "ha noi");
		hashmap.put("hoa ky", "washingtion,d.c");
		hashmap.put("han quoc", "seoul");
		System.out.println(hashmap);
		Iterator<Map.Entry<String, String>> it = hashmap.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, String> entry = it.next();
			System.out.println(entry.getValue() + " la thu do cua " + entry.getKey());
		}

	}
}
