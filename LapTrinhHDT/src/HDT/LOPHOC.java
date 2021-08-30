package HDT;

import java.util.Scanner;

public class LOPHOC {
	private int MaLop, SiSo;
	private String TenLop, DiaChi, GVCN;

	public int getMaLop() {
		return MaLop;
	}

	public void setMaLop(int maLop) {
		MaLop = maLop;
	}

	public int getSiSo() {
		return SiSo;
	}

	public void setSiSo(int siSo) {
		SiSo = siSo;
	}

	public String getTenLop() {
		return TenLop;
	}

	public void setTenLop(String tenLop) {
		TenLop = tenLop;
	}

	public String getDiaChi() {
		return DiaChi;
	}

	public void setDiaChi(String diaChi) {
		DiaChi = diaChi;
	}

	public String getGVCN() {
		return GVCN;
	}

	public void setGVCN(String gVCN) {
		GVCN = gVCN;
	}

	public void InThongTin() {
		System.out.println("Lop " + TenLop + " co ma la: " + MaLop + " o " + DiaChi);
		System.out.println("Lop co  " + SiSo + " hoc sinh va co giao vien chu nhiem la " + GVCN);
	}

	private Scanner sc = new Scanner(System.in);

	public LOPHOC() {
		System.out.println("nhap thong tin lop hoc");
		MaLop = sc.nextInt();
		sc.nextLine();
		TenLop = sc.nextLine();
		SiSo = sc.nextInt();
		sc.nextLine();
		DiaChi = sc.nextLine();
		GVCN = sc.nextLine();
	}

	public LOPHOC(int maLop, String tenLop, int siSo, String diaChi, String gvcn) {
		this.MaLop = maLop;
		this.TenLop = tenLop;
		this.SiSo = siSo;
		this.DiaChi = diaChi;
		this.GVCN = gvcn;
	}

}
