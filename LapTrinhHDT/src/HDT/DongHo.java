package HDT;

import java.util.Scanner;

public class DongHo {
	private int gio, phut, giay;
	private Boolean laBuoiSang;

	public int getGio() {
		return gio;
	}

	public void setGio(int gio) {
		this.gio = gio;
		if (gio < 12)
			laBuoiSang = true;
		else {
			laBuoiSang = false;
		}
	}

	public int getPhut() {
		return phut;
	}

	public void setPhut(int phut) {
		this.phut = phut;
	}

	public int getGiay() {
		return giay;
	}

	public void setGiay(int giay) {
		this.giay = giay;
	}

	public Boolean getLaBuoiSang() {
		return laBuoiSang;
	}

	public void setLaBuoiSang(Boolean laBuoiSang) {
		this.laBuoiSang = laBuoiSang;
	}

	private Scanner sc = new Scanner(System.in);

	private int NhapGio(String msgNhap, String msgErr, int min, int max) {
		int so = 0;
		Boolean ok = false;
		do {
			try {
				System.out.println(msgNhap);
				so = sc.nextInt();
				ok = true;
				ok = ok && so >= min && so <= max;

			} catch (Exception e) {
				System.out.println(msgErr);
				sc.nextLine();
			}

		} while (!ok);
		return so;
	}

	public DongHo(int gio, int phut, int giay) {
		setGio(gio);
		setPhut(phut);
		setGiay(giay);
	}

	public DongHo() {
		setGio(NhapGio("nhap gio: ", "can nhap so nguyen trong khoang [0,24] ! ", 0, 24));
		setPhut(NhapGio("nhap phut: ", "can nhap so nguyen trong khoang [0,59] ! ", 0, 59));
		setGiay(NhapGio("nhap giay: ", "can nhap so nguyen trong khoang [0,59] ! ", 0, 59));
	}

	public DongHo LayKhoangThoiGian(DongHo dh) {
		int a = Math.abs(gio * 3600 + phut * 60 + giay - dh.gio * 3600 - dh.phut * 60 - dh.giay);
		return new DongHo(a / 3600, (a % 3600) / 60, (a % 3600) % 60);
	}

	public String InThongTin() {
		String s = gio + " : " + phut + " : " + giay + " " + getLaBuoiSang() + " la buoi sang";
		return s;
	}
}
