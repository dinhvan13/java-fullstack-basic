package HDT;

import java.util.Scanner;

public class SoNguyen {
	private int giaTri;
	private Boolean laSoChan, laNguyenTo, laSoDoiXUng;

	public Boolean isLaSoChan() {
		return laSoChan;
	}

	public void setLaSoChan(boolean laSoChan) {
		this.laSoChan = laSoChan;

	}

	public Boolean isLaNguyenTo() {
		return laNguyenTo;
	}

	private Boolean kiemTraChan() {
		if (giaTri % 2 == 0)
			return true;
		return false;
	}

	private Boolean kiemTraNguyenTo() {
		if (giaTri < 2)
			return false;
		if (giaTri == 2 || giaTri == 3 || giaTri == 5)
			return true;
		if (giaTri % 2 == 0)
			return false;
		for (int i = 3; i < Math.sqrt(giaTri); i += 2) {
			if (giaTri % i == 0)
				return false;
		}
		return true;

	}

	private Boolean kiemTraDoiXung() {
		char[] arr = String.valueOf(giaTri).toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != arr[arr.length - 1 - i]) {
				return false;
			}

		}
		return true;
	}

	public Boolean isLaSoDoiXUng() {
		return laSoDoiXUng;
	}

	public int getGiaTri() {
		return giaTri;
	}

	public void setGiaTri(int giaTri) {
		this.giaTri = giaTri;
		laSoChan = kiemTraChan();
		laNguyenTo = kiemTraNguyenTo();
		laSoDoiXUng = kiemTraDoiXung();
	}

	private Scanner sc = new Scanner(System.in);

	public SoNguyen() {
		setGiaTri(NhapSo("nhap gia tri so nguyen ", "Loi, vui long nhap lai! "));
	}

	public SoNguyen(int n) {
		setGiaTri(n);
	}

	public SoNguyen congHaiSoNguyen(SoNguyen n) {
		return new SoNguyen(giaTri + n.getGiaTri());
	}

	private int NhapSo(String msgNhap, String msgErr) {
		int so = 0;
		Boolean ok = false;
		do {
			try {
				System.out.println(msgNhap);
				so = sc.nextInt();
				ok = true;
			} catch (Exception e) {
				System.out.println(msgErr);
				sc.nextLine();
			}
		} while (!ok);
		return so;
	}

	public String inThongTin() {
		return "SoNguyen [giaTri=" + giaTri + ", laSoChan=" + laSoChan + ", laNguyenTo=" + laNguyenTo + ", laSoDoiXUng="
				+ laSoDoiXUng + "]";
	}

}
