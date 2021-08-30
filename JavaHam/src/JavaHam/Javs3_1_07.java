package JavaHam;

public class Javs3_1_07 {
	public static int TimSoFibonaci(int n) {
		if (n == 1 || n == 2) {
			return 1;
		} else {
			return TimSoFibonaci(n - 1) + TimSoFibonaci(n - 2);
		}
	}

	public static void main(String[] args) {
		int n = 12;
		int kq = TimSoFibonaci(n);
		System.out.println("so fibonaci thu " + n + " la : " + kq);
	}
}
