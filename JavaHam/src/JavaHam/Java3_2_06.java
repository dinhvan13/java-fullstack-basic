package JavaHam;

public class Java3_2_06 {
	public static double TinhChuViHinhTron(double r) {
		return Math.round(2 * r * Math.PI);
	}

	public static double TinhDienTichHinhTron(double r) {
		return Math.round(Math.PI * Math.pow(r, 2));
	}

	public static void main(String[] args) {
		double bk = 3.4;
		System.out.println("chu vi cua hinh tron la: " + TinhChuViHinhTron(bk));
		System.out.println("Dien tich cua hinh tron la: " + TinhDienTichHinhTron(bk));

	}
}
