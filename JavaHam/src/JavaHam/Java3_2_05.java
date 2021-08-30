package JavaHam;

public class Java3_2_05 {
	public static double TimLogarit(double a, double b) {
		return Math.log(b) / Math.log(a);
	}

	public static void main(String[] args) {
		double a = 2, b = 4.5;
		System.out.println("logarit cua hai so la : " + TimLogarit(a, b));
	}
}
