package HDT;

import java.time.LocalDate;
import java.util.Scanner;

public class SACH {
	private String TenSach, TheLoaiSach, TacGia;
	private int Gia;
	private LocalDate NgayXuatBan;

	public String getTenSach() {
		return TenSach;
	}

	public void setTenSach(String tenSach) {
		TenSach = tenSach;
	}

	public String getTheLoaiSach() {
		return TheLoaiSach;
	}

	public void setTheLoaiSach(String theLoaiSach) {
		TheLoaiSach = theLoaiSach;
	}

	public String getTacGia() {
		return TacGia;
	}

	public void setTacGia(String tacGia) {
		TacGia = tacGia;
	}

	public int getGia() {
		return Gia;
	}

	public void setGia(int gia) {
		Gia = gia;
	}

	public LocalDate getNgayXuatBan() {
		return NgayXuatBan;
	}

	public void setNgayXuatBan(LocalDate ngayXuatBan) {
		NgayXuatBan = ngayXuatBan;
	}

	private Scanner sc = new Scanner(System.in);

	public SACH() {
		System.out.println("Nhap thong tin cua sach ");
		setTenSach(sc.nextLine());
		setTheLoaiSach(sc.nextLine());
		setGia(sc.nextInt());
		sc.nextLine();
		setNgayXuatBan(LocalDate.parse(sc.nextLine()));
		// sc.nextLine();
		setTacGia(sc.nextLine());
	}

	public void InThongTin() {
		System.out.println(TenSach + " la sach " + TheLoaiSach + " co gia: " + Gia + " xuat ban ngay " + NgayXuatBan
				+ " viet boi " + TacGia);
	}
}
