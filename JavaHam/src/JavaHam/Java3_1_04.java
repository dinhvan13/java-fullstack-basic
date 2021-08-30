package JavaHam;

import java.util.Scanner;

public class Java3_1_04 {
	public static int NhapSoNguyen() {
		int n = 0;
		boolean ktra = false;
		System.out.println("vui long nhap so nguyen");
		Scanner sc = new Scanner(System.in);

		while (!ktra) {
			try {
				n = sc.nextInt();
				ktra = true;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("ban vui long nhap lai!");
				sc.nextLine();
			}
		}
		return n;
	}

	public static void main(String[] args) {
		int kq = NhapSoNguyen();
		System.out.println(kq);
	}
}
