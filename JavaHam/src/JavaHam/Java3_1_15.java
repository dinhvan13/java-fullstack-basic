package JavaHam;

import java.util.Scanner;

public class Java3_1_15 {
	public static String NhapChuoi() {
		System.out.println("vui long nhap chuoi ");
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}

	public static void XuatChuoi(String chuoi) {

		System.out.println("chuoi vua nhap la :" + chuoi);

	}

	public static void main(String[] args) {
		String chuoi = NhapChuoi();
		XuatChuoi(chuoi);
	}
}
