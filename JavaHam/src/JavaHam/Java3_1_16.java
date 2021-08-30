package JavaHam;

public class Java3_1_16 {
	public static int TongMang(int a[]) {
		int tong = 0;
		for (int i = 0; i < a.length; i++) {
			tong += a[i];
		}
		return tong;
	}

	public static void main(String[] args) {
		int a[] = new int[] { 1, 4, 5, 6, 7, 8, 9, 0, 1, 3 };
		int kq = TongMang(a);
		System.out.println("tong cac phan tu trong mang la : " + kq);
	}
}
