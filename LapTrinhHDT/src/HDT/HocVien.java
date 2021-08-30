package HDT;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HocVien {
	private int MaHocVien;
	private String HoTen, Ho, Email,Ten;
	

	private LocalDate NgaySinh;
	private double HocPhi;
	private Scanner sc = new Scanner(System.in);

	public int getMaHocVien() {
		return MaHocVien;
	}

	public void setMaHocVien(int maHocVien) {
		MaHocVien = maHocVien;
	}

	public String getHoTen() {
		return HoTen;
	}

	public void setHoTen(String hoTen) {
		HoTen = hoTen;
	}

	public String getHo() {
		setHo();
		return Ho;
	}

	private void setHo() {
		Ho = HoTen.split(" ")[0];
	}
	public String getTen() {
		setTen();
		return Ten;
	}

	private void setTen() {
		String[] arr = HoTen.split(" ");
		Ten = arr[arr.length-1];
	}

	public String getEmail() {
		setEmail();
		return Email;
	}

	private void setEmail() {
		Email = HoTen.replace(" ", "").toLowerCase() + "@edusolution.com";
	}

	public LocalDate getNgaySinh() {
		return NgaySinh;
	}

	public void setNgaySinh(LocalDate ngaySinh) {
		NgaySinh = ngaySinh;
	}

	public double getHocPhi() {
		setHocPhi(HocPhi);
		return HocPhi;
	}

	public void setHocPhi(double hocphi) {
		if (hocphi > 3000000) {
			this.HocPhi = hocphi * 0.95;
		}

	}

	public HocVien() {
		System.out.println("nhap thong tin cua hoc vien ");
		MaHocVien = sc.nextInt();
		sc.nextLine();
		HoTen = sc.nextLine();
		NgaySinh = LocalDate.parse(sc.nextLine());
		HocPhi = sc.nextDouble();
	}

	public HocVien(int maHocVien, String hoTen, LocalDate ngaySinh, double hp) {
		this.MaHocVien = maHocVien;
		this.HoTen = hoTen;
		this.NgaySinh = ngaySinh;
		this.HocPhi = hp;
	}

  public String inThongTin() {
	  String s = "ma hoc vien "+MaHocVien+" co ten la "+HoTen+" co email la "+getEmail();
	  return s;
  }

	public static List<HocVien> TimKiemHocVien(List<HocVien> lst) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap ten hoc vien muon tim kiem ");
		String ten = sc.nextLine();
		List<HocVien> lstResult = new ArrayList<>();
		for (HocVien i : lst) {
			if (i.getTen().contains(ten))
				lstResult.add(i);
		}
		return lstResult;
	}

}
