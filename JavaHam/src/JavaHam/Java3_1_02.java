package JavaHam;

public class Java3_1_02 {
	public static void VeBanCoCaRo(int a, int b) {
		for (int i = 0; i <= a; i++) {
			for (int j = 0; j <= b; j++) {
				System.out.print(" . ");
			}
			System.out.println("   ");
		}
	}

	public static void main(String[] args) {
		int hang = 20, cot = 20;
		VeBanCoCaRo(hang, cot);
	}
}
