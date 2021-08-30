package HDT;

import java.util.Scanner;

public class PhanSo {
	private int tuSo, mauSo;

	public int getTuSo() {
		return tuSo;
	}

	public void setTuSo(int tuSo) {
		this.tuSo = tuSo;
	}

	public int getMauSo() {
		return mauSo;
	}

	public void setMauSo(int mauSo) {
		this.mauSo = mauSo;
	}

	private PhanSo ToiGian() {
		if (mauSo == 0)
			return null;
		int tu = tuSo, mau = mauSo;

		while (Math.abs(tu) != Math.abs(mau)) {
			if (Math.abs(tu) > Math.abs(mau)) {
				tu = Math.abs(tu) - Math.abs(mau);
			} else {
				mau = Math.abs(mau) - Math.abs(tu);
			}
		}
		return new PhanSo(tuSo / tu, mauSo / mau);
	}

	private Scanner sc = new Scanner(System.in);

	public PhanSo() {
		System.out.println("Nhap tu so :");
		setTuSo(sc.nextInt());
		System.out.println("Nhap mau so: ");
		setMauSo(sc.nextInt());
	}

	public PhanSo(int tu, int mau) {
		setTuSo(tu);
		setMauSo(mau);
	}

	public PhanSo CongHaiPhanSo(PhanSo ps) {
		return new PhanSo(tuSo * ps.getMauSo() + mauSo * ps.getTuSo(), mauSo * ps.getMauSo()).ToiGian();
	}

	public PhanSo TruHaiPhanSo(PhanSo ps) {
		return new PhanSo(tuSo * ps.getMauSo() - mauSo * ps.getTuSo(), mauSo * ps.getMauSo()).ToiGian();
	}

	public String inThongTin() {
		return tuSo + " /" + mauSo;
	}

}
