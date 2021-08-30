package JavaHam;

public class Java3_2_01 {
	public static int LamTronSoXuong(double n) {
		return (int)Math.floor(n);
	}

	public static int LamTronSoLen(double n) {
		return (int)Math.ceil(n);
	}

	public static void main(String[] args) {
		double n = 2.34;
		System.out.println(LamTronSoLen(n));
		System.out.println(LamTronSoXuong(n));
	}
}
