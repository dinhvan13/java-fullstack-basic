package JavaMap;

import java.util.HashMap;

public class Java2_4_05 {
	public static void main(String[] args) {
		HashMap<Integer, String> hashmap1 = new HashMap<Integer, String>();
		hashmap1.put(1, "red");
		hashmap1.put(2, "green");
		hashmap1.put(3, "blue");
		hashmap1.remove(2);
		System.out.println("hm sau khi xoa phan tu co key = 2 : " + hashmap1);
	}
}
