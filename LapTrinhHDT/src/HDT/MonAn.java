package HDT;

import java.util.Scanner;

public class MonAn {
	private String TenMonAn, GioiThieu, NguyenLieuChinh;
	private int GiaBan;

	public String getTenMonAn() {
		return TenMonAn;
	}

	public void setTenMonAn(String tenMonAn) {
		TenMonAn = tenMonAn;
	}

	public String getGioiThieu() {
		return GioiThieu;
	}

	public void setGioiThieu(String gioiThieu) {
		GioiThieu = gioiThieu;
	}

	public String getNguyenLieuChinh() {
		return NguyenLieuChinh;
	}

	public void setNguyenLieuChinh(String nguyenLieuChinh) {
		NguyenLieuChinh = nguyenLieuChinh;
	}

	public int getGiaBan() {
		return GiaBan;
	}

	public void setGiaBan(int giaBan) {
		GiaBan = giaBan;
	}

	private Scanner sc = new Scanner(System.in);

	public MonAn() {
		System.out.println("ten mon an, gia ban, gioi thieu, duoc lam tu nguyen lieu : ");
		TenMonAn = sc.nextLine();
		GiaBan = sc.nextInt();
		sc.nextLine();
		GioiThieu = sc.nextLine();
		NguyenLieuChinh = sc.nextLine();
	}

	public void InThongTin() {
		System.out.println(TenMonAn + ", " + GioiThieu + " , duoc lam tu cac nguyen lieu chinh " + NguyenLieuChinh);
	}
}
