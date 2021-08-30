package JavaHam;

import java.util.Scanner;

public class Java3_1_13 {
	private static Scanner sc = new Scanner(System.in);

	public static int KiemTraSoNhap() {
		int n = 0;
		boolean kt = false;
		System.out.println("moi ban nhap vao mot so nguyen!");
		while (!kt) {
			try {
				n = sc.nextInt();
				if (n < 100 && n > 1) {
					kt = true;

				} else {
					System.out.println("ban nhap sai khoang gia tri. Vui long nhap lai: ");
				}

			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("ban nhap sai kieu du lieu . vui long nhap lai: ");
				sc.nextLine();
			}

		}
		return n;
	}

	public static void main(String[] args) {
		System.out.println("gia tri so nguyen vua nhap la : " + KiemTraSoNhap());
	}
}
