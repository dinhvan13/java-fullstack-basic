package HDT;

import java.time.LocalDate;
import java.util.Scanner;

public class DonDatHang {
	private int MaSoDon, SoLuong;
	private String TenSanPham, GhiChu;
	private double DonGia, ThanhTien;

	public int getMaSoDon() {
		return MaSoDon;
	}

	public void setMaSoDon(int maSoDon) {
		MaSoDon = maSoDon;
	}

	public int getSoLuong() {
		return SoLuong;
	}

	public void setSoLuong(int soLuong) {
		SoLuong = soLuong;
	}

	public String getTenSanPham() {
		return TenSanPham;
	}

	public void setTenSanPham(String tenSanPham) {
		TenSanPham = tenSanPham;
	}

	public String getGhiChu() {
		return GhiChu;
	}

	public void setGhiChu(String ghiChu) {
		GhiChu = ghiChu;
	}

	public double getDonGia() {
		return DonGia;
	}

	public void setDonGia(double donGia) {
		DonGia = donGia;
	}

	public double getThanhTien() {

		return setThanhTien();
	}

	private double setThanhTien() {
		return ThanhTien = SoLuong * DonGia;
	}

	public LocalDate getNgayDat() {
		return NgayDat;
	}

	public void setNgayDat(LocalDate ngayDat) {
		NgayDat = ngayDat;
	}

	private LocalDate NgayDat;
	private Scanner sc = new Scanner(System.in);

	public DonDatHang() {
		System.out.println("Nhap thong tin cua don dat hang: ");
		MaSoDon = sc.nextInt();
		SoLuong = sc.nextInt();
		sc.nextLine();
		TenSanPham = sc.nextLine();
		GhiChu = sc.nextLine();
		NgayDat = LocalDate.parse(sc.nextLine());
		DonGia = sc.nextDouble();
	}

	public DonDatHang(String tenSP, String ghiChu, int maSoDon, LocalDate ngayDat, int soLuong, double donGia) {
		this.TenSanPham = tenSP;
		this.GhiChu = ghiChu;
		this.MaSoDon = maSoDon;
		this.NgayDat = ngayDat;
		this.SoLuong = soLuong;
		this.DonGia = donGia;
	}

	public void InThongTin() {
		System.out.println("Don hang co so " + MaSoDon + " dat ngay " + NgayDat + " co tong tien la " + setThanhTien());
	}
}
