package JavaHam;

public class Java3_1_11 {
	public static void ThayThePhanTuNhoNhat(int a[], int n) {
		if (n < 2) {
			System.out.println("can nhap so phan tu nhieu hon 2");
			return;
		}
		int first = a[0];
		int second = a[1];
		//System.out.println(first+" "+second);
		for (int i = 0; i < n; i++) {
			if (a[i] < first) {
				second = first;
				first = a[i];

			} else if (a[i] < second && a[i] != first) {
				second = a[i];
			}

		}
		for (int i = 0; i < n; i++) {
			if (a[i] != first) {
				a[i] = first;
			} else {
				a[i] = second;
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + ",");
		}
	}

	public static void main(String[] args) {
		int a[] = { 4, 5, 6, 1, 3, 2, 4, 0 };
		int n = a.length;
		ThayThePhanTuNhoNhat(a, n);
	}
}
