package HDT;

import java.util.Scanner;

public class SoPhuc {
	private double phanThuc, phanAo;

	public double getPhanThuc() {
		return phanThuc;
	}

	public void setPhanThuc(double phanThuc) {
		this.phanThuc = phanThuc;
	}

	public double getPhanAo() {
		return phanAo;
	}

	public void setPhanAo(double phanAo) {
		this.phanAo = phanAo;
	}

	private Scanner sc = new Scanner(System.in);

	public String inThongTin() {
		String s = phanThuc + " + " + phanAo + " *i ";
		return s;
	}

	public SoPhuc() {
		System.out.println("vui long nhap phan thuc ");
		setPhanThuc(sc.nextDouble());
		System.out.println("vui long nhap phan ao ");
		setPhanAo(sc.nextDouble());
	}

	public SoPhuc(double phanthuc, double phanao) {
		setPhanThuc(phanthuc);
		setPhanAo(phanao);
	}

}
