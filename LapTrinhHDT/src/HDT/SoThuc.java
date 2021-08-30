package HDT;

import java.util.Scanner;

public class SoThuc {
	private double GiaTri;
	private boolean LaSoDuong;

	public double getGiaTri() {
		return GiaTri;
	}

	public void setGiaTri(double giaTri) {
		GiaTri = giaTri;
	}

	public Boolean LaSoDuong() {
		setLaSoDuong();
		return LaSoDuong;
	}

	public void setLaSoDuong() {
		if (GiaTri > 0)
			LaSoDuong = true;
		else
			LaSoDuong = false;
	}

	private Scanner sc = new Scanner(System.in);

	public SoThuc() {
		System.out.println("nhap gia tri cua so thuc :");
		GiaTri = sc.nextDouble();

	}

	public static SoThuc TimMax(SoThuc a, SoThuc b, SoThuc c) {
		if (a.getGiaTri() > b.getGiaTri() && a.getGiaTri() > c.getGiaTri())
			return a;
		if (b.getGiaTri() > c.getGiaTri() && c.getGiaTri() > a.getGiaTri())
			return b;
		return c;
	}

	public double TinhCanBacN(int a) {
		return Math.pow(GiaTri, 1. / a);
	}
}
