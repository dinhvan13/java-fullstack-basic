package HDT;

import java.time.LocalDate;
import java.util.Scanner;

public class HocSinh {
	private String HoTen, Lop;
	private double DiemToan, DiemVan, DiemAnh, DiemTrungBinh;
	private LocalDate NgaySinh;

	public String getHoTen() {
		return HoTen;
	}

	public void setHoTen(String hoTen) {
		HoTen = hoTen;
	}

	public String getLop() {
		return Lop;
	}

	public void setLop(String lop) {
		Lop = lop;
	}

	public double getDiemToan() {
		return DiemToan;
	}

	public void setDiemToan(double diemToan) {
		DiemToan = diemToan;
	}

	public double getDiemVan() {
		return DiemVan;
	}

	public void setDiemVan(double diemVan) {
		DiemVan = diemVan;
	}

	public double getDiemAnh() {
		return DiemAnh;
	}

	public void setDiemAnh(double diemAnh) {
		DiemAnh = diemAnh;
	}

	private double getDiemTrungBinh() {
		setDiemTrungBinh();
		return DiemTrungBinh;
	}

	private void setDiemTrungBinh() {
		DiemTrungBinh = (DiemAnh + DiemToan + DiemVan) / 3;
	}

	public LocalDate getNgaySinh() {
		return NgaySinh;
	}

	public void setNgaySinh(LocalDate ngaySinh) {
		NgaySinh = ngaySinh;
	}

	private Scanner sc = new Scanner(System.in);

	public HocSinh() {
		System.out.println("nhap thong tin cua hoc sinh: ");
		HoTen = sc.nextLine();
		Lop = sc.nextLine();
		NgaySinh = LocalDate.parse(sc.nextLine());
		DiemToan = sc.nextDouble();
		DiemVan = sc.nextDouble();
		DiemAnh = sc.nextDouble();
	}

	public HocSinh(String hoTen, String lop, LocalDate ngaySinh, double diemToan, double diemVan, double diemAnh) {
		this.HoTen = hoTen;
		this.Lop = lop;
		this.NgaySinh = ngaySinh;
		this.DiemToan = diemToan;
		this.DiemVan = diemVan;
		this.DiemAnh = diemAnh;
	}

	public void LayThongTin() {
		System.out.println(HoTen + " hoc lop " + Lop + ", co diem trung binh la " + getDiemTrungBinh());
	}

}
