package JavaHam;

public class JavaHamVietHoaKiTuDau {
	public static String VietHoaKiTuDau(String str) {
		String str2[] = str.split("\\s+");
		for (int i = 0; i < str2.length; i++) {
			str2[i] = str2[i].substring(0, 1).toUpperCase() + str2[i].substring(1);
		}
		return String.join(" ", str2);
	}

	public static void main(String[] args) {
		String str = "nguyen van anh toan   ";
		str = str.trim();
		System.out.println("chuoi sau khi chuan hoa la: " + VietHoaKiTuDau(str));

	}
}
