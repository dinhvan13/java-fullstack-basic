package JavaHam;

public class Java3_2_04 {
	public static double TimSoNhoNhat(double a, double b, double c) {
		return Math.min(Math.min(a, b), c);
	}

	public static void main(String[] args) {
		double a = 3.4, b = 4.5, c = 6.7;

		System.out.println("so nho nhat trong 3 so la: " + TimSoNhoNhat(a, b, c));
	}
}
