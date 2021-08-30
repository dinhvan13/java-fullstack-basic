package JavaHam;

import java.util.Arrays;
import java.util.Scanner;

public class Java3_1_12 {
	private static Scanner sc = new Scanner(System.in);

	public static void NhapMang(int a[], int n) {
		System.out.println("Nhap so phan tu cua mang ");
		for (int i = 0; i < n; i++) {
			System.out.println("nhap phan tu thu a[ " + i + " ]");
			a[i] = sc.nextInt();
		}
	}

	public static void XuatMang(int a[]) {
		System.out.println("mang da nhap la : ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static void main(String[] args) {
		int n;
		do {
			System.out.println("nhap so phan tu cua mang : ");
			n = sc.nextInt();
		} while (n <= 0);
		int a[] = new int[n];
		NhapMang(a, n);
		Arrays.sort(a);
		XuatMang(a);
	}
}
