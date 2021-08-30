package JavaHam;

public class Java3_2_02 {
	public static void GiaiPhuongTrinhBacHai(double a, double b, double c) {
		double delta = b * b - 4 * a * c;
		double x1, x2;
		if (a == 0) {
			if (b == 0) {
				if (c == 0) {
					System.out.println("phuong trinh vo so nghiem");
				} else {
					System.out.println("phuong trinh vo nghiem");
				}
			} else {
				System.out.println("phuong trinh co mot nghiem duy nhat: " + -b / c);
			}
		} else {

			if (delta == 0) {
				System.out.println("phuong trinh co nghiem kep x1 = x2 = " + -b / (2 * a));
			} else if (delta > 0) {
				x1 = (-b + Math.sqrt(delta)) / (2 * a);
				x2 = (-b - Math.sqrt(delta)) / (2 * a);
				System.out.println("phuong trinh co hai nghiem phan biet x1 = " + x1 + " va x2 = " + x2);
			} else {
				System.out.println("Phuong trin vo nghiem");
			}
		}
	}

	public static void main(String[] args) {
		double a = 0, b = 2, c = 6;
		GiaiPhuongTrinhBacHai(a, b, c);
	}
}
