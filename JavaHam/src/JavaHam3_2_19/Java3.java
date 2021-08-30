package JavaHam3_2_19;

public class Java3 {
	public static void SapXepMangTangDan(int a[]) {
		int temp = a[0];
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			// System.out.println(a[i]+" ");
		}

	}

	public static void HoanDoiPhanTuDauTien(int a[]) {
		int index = 1;
		if (a[0] == 0) {
			while (a[index] == 0) {
				index++;
			}
			int temp = a[0];
			a[0] = a[index];
			a[index] = temp;
		}
	}

	public static void XuatMang(int a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
	}

	public static void main(String[] args) {
		int a[] = { 8, 0, 0, 9, 0, 3 };
		SapXepMangTangDan(a);
		XuatMang(a);
		System.out.println(" ");
		HoanDoiPhanTuDauTien(a);
		XuatMang(a);

	}
}
