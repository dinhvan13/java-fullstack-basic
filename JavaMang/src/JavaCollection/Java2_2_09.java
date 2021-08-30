package JavaCollection;

import java.util.Scanner;

public class Java2_2_09 {
	public static void main(String[] args) {
		int n, c, d;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("nhap vao so phan tu cua mang: ");
			n = sc.nextInt();
		} while (n < 0);
		// khai bao mang ban dau, mang chan, mang le
		int a[] = new int[n];
		int ch[] = new int[n];
		int le[] = new int[n];
		// nhap cac phan tu cho mang a
		System.out.println("nhap cac phan tu cho mang ");
		for (int i = 0; i < n; i++) {
			System.out.println("phan tu thu " + i + " :");
			a[i] = sc.nextInt();
		}

		c = d = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] % 2 == 0) {
				ch[c] = a[i];
				c++;
			} else {
				le[d] = a[i];
				d++;
			}
		}
		// xuat mang le

		System.out.println("cac phan tu cua mang chan la: ");
		for (int i = 0; i < c; i++) {
			System.out.print(ch[i] + " ");

		}
		// xuat mang le
		System.out.println("\ncac phan tu cua mang le la: ");
		for (int i = 0; i < d; i++) {
			System.out.print(le[i] + " ");

		}
	}
}
