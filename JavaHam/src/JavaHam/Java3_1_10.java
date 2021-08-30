package JavaHam;

public class Java3_1_10 {
	public static String VietHoaHoTen(String hoten) {
		String kq = hoten.substring(0, 1).toUpperCase() + hoten.substring(1);
		return kq;
	}

	public static void main(String[] args) {
		String str2 = " nguyen    van   a  5678    ";
		str2 = str2.trim();
		str2 = str2.replaceAll("\\s+", " ");
		System.out.println("chuoi sau khi duoc chuan hoa la: " + VietHoaHoTen(str2));
	}
}
