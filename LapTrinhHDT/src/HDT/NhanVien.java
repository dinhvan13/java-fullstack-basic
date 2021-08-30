package HDT;

import java.util.Scanner;

public class NhanVien {
	private int MaNhanVien;
	private String HoVaTen, PhongBan, DiaChi, SoDienThoai;

	public int getMaNhanVien() {
		return MaNhanVien;
	}

	public void setMaNhanVien(int maNhanVien) {
		MaNhanVien = maNhanVien;
	}

	public String getHoVaTen() {
		return HoVaTen;
	}

	public void setHoVaTen(String hoVaTen) {
		HoVaTen = hoVaTen;
	}

	public String getPhongBan() {
		return PhongBan;
	}

	public void setPhongBan(String phongBan) {
		PhongBan = phongBan;
	}

	public String getDiaChi() {
		return DiaChi;
	}

	public void setDiaChi(String diaChi) {
		DiaChi = diaChi;
	}

	public String getSoDienThoai() {
		return SoDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		SoDienThoai = soDienThoai;
	}

	private Scanner sc = new Scanner(System.in);

	public NhanVien() {
		System.out.println("nhap thong tin cua nhan vien ");
		MaNhanVien = sc.nextInt();
		sc.nextLine();
		HoVaTen = sc.nextLine();
		PhongBan = sc.nextLine();
		DiaChi = sc.nextLine();
		SoDienThoai = sc.nextLine();
	}

	public void InThongTin() {
		System.out.println("Nhan vien co ma nhan vien la : " + MaNhanVien + " , " + HoVaTen + " , thuoc phong ban "
				+ PhongBan + " ,co so dien thoai la : " + SoDienThoai);
	}
}
