package JavaHam;

public class Java3_1_03 {
	public static int TimGiaiThua(int n) {
		int gt = 1;
		for (int i = 1; i <= n; i++) {
			gt *= i;
		}
		return gt;
	}

	public static int TimGiaiThuaDeQuy(int n) {
		if (n == 1)
			return 1;
		return n * TimGiaiThuaDeQuy(n - 1);
	}

	public static void main(String[] args) {
		int n = 5;
		System.out.println("giai thua cua " + n + " la " + TimGiaiThuaDeQuy(n));
	}
}
