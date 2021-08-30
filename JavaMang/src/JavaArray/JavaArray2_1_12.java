package JavaArray;

import java.util.Scanner;

public class JavaArray2_1_12 {
	public static void main(String[] args) {
		int m, n;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("nhap so dong cua ma tran");
			m = sc.nextInt();
			System.out.println("nhap so cot cua ma tran");
			n = sc.nextInt();
		} while (m < 1 || n < 1);

		int[][] a = new int[m][n];
		int[][] b = new int[m][n];
		int[][] c = new int[m][n];

		// nhap mang a
		System.out.println("nhap cac phan tu cho mang a");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.println("a[" + i + "][" + j + "]");
				a[i][j] = sc.nextInt();
			}
		}

		// nhap mang b

		System.out.println("nhap cac phan tu cho mang b");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.println("b[" + i + "][" + j + "]");
				b[i][j] = sc.nextInt();
			}
		}
		// in ra mang a
		System.out.println("in mang a");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println("\n");
		}

		// in ra mang b
		System.out.println("in mang b");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println("\n");
		}

		// cong hai mang
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				c[i][j] = a[i][j] + b[i][j];

			}
		}
		// in mang c
		System.out.println("tong hai mang la: ");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println("\n");
		}
	}
}
