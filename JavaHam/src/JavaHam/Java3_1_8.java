package JavaHam;

public class Java3_1_8 {
	public static String InHoaChuCaiDau(String chuoi) {
		String str[] = chuoi.split("\\s+");
		for (int i = 0; i < str.length; i++) {
			str[i] = str[i].substring(0, 1).toUpperCase() + str[i].substring(1);
		}
		return String.join(" ", str);
	}

	public static void main(String[] args) {
		String str2 = " nguyen  dinh van number    one  5678    ";
		str2 = str2.trim();
		System.out.println("chuoi sau khi duoc chuan hoa la : " + InHoaChuCaiDau(str2));

	}
}
