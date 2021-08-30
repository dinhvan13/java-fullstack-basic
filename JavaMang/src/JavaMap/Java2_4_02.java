package JavaMap;

import java.util.HashMap;

public class Java2_4_02 {
	public static void main(String[] args) {
		HashMap<Integer, String> hashmap1 = new HashMap<Integer, String>();
		hashmap1.put(1, "red");
		hashmap1.put(2, "green");
		hashmap1.put(3, "blue");

		HashMap<Integer, String> hashmap2 = new HashMap<Integer, String>();
		hashmap2.put(4, "white");
		hashmap2.put(5, "black");
		hashmap2.put(6, "orange");

		hashmap1.putAll(hashmap2);
		System.out.println("map tong hop: " + hashmap1);
	}
}
