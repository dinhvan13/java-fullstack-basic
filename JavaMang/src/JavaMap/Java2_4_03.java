package JavaMap;

import java.util.HashMap;

public class Java2_4_03 {
	public static void main(String[] args) {
		HashMap<Integer, String> hashmap1 = new HashMap<Integer, String>();
		hashmap1.put(1, "red");
		hashmap1.put(2, "green");
		hashmap1.put(3, "blue");
		if (hashmap1.containsKey(4)) {
			System.out.println("chua keu = 4");
		} else {
			System.out.println("khong chua key = 4");
		}
	}
}
