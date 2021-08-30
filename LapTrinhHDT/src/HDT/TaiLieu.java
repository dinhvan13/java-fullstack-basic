package HDT;

import java.util.Scanner;

public class TaiLieu {
	protected String tenNhaXuatBan;
	protected int maTaiLieu, soBanPhatHanh;

	public int getMaTaiLieu() {
		return maTaiLieu;
	}

	public void setMaTaiLieu(int maTaiLieu) {
		this.maTaiLieu = maTaiLieu;
	}

	public String getTenNhaXuatBan() {
		return tenNhaXuatBan;
	}

	public void setTenNhaXuatBan(String tenNhaXuatBan) {
		this.tenNhaXuatBan = tenNhaXuatBan;
	}

	public int getSoBanPhatHanh() {
		return soBanPhatHanh;
	}

	public void setSoBanPhatHanh(int soBanPhatHanh) {
		this.soBanPhatHanh = soBanPhatHanh;
	}

	private Scanner sc = new Scanner(System.in);

	public void Nhap() {
		System.out.println("nhap ma tai lieu, so ban phat hanh, ten nha xuat ban: ");
		setMaTaiLieu(sc.nextInt());
		setSoBanPhatHanh(sc.nextInt());
		sc.nextLine();
		setTenNhaXuatBan(sc.nextLine());

	}

	public void HienThiThongTin() {
		System.out.println("ma tai lieu: " + maTaiLieu + "\nso ban phat hanh: " + soBanPhatHanh + ""
				+ "\nten nha xuat ban " + tenNhaXuatBan);
	}

}
