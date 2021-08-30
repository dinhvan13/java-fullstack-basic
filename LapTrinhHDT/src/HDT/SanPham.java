package HDT;

import java.util.Scanner;

public class SanPham {
	private int maSanPham;
	private String tenSanPham, loaiSanPham;
	private Boolean laSanPhamMoi;

	public int getMaSanPham() {
		return maSanPham;
	}

	public void setMaSanPham(int maSanPham) {
		this.maSanPham = maSanPham;
	}

	public String getTenSanPham() {
		return tenSanPham;
	}

	public void setTenSanPham(String tenSanPham) {
		this.tenSanPham = tenSanPham;
	}

	public String getLoaiSanPham() {
		return loaiSanPham;
	}

	public void setLoaiSanPham(String loaiSanPham) {
		this.loaiSanPham = loaiSanPham;
	}

	public Boolean getLaSanPhamMoi() {
		return laSanPhamMoi;
	}

	public void setLaSanPhamMoi(Boolean laSanPhamMoi) {
		this.laSanPhamMoi = laSanPhamMoi;
	}

	private Scanner sc = new Scanner(System.in);

	public SanPham() {
		System.out.println("nhap thong tin san pham bao gom ma san pham,ten san pham,loai s" + "san pham");
		maSanPham = sc.nextInt();
		sc.nextLine();
		tenSanPham = sc.nextLine();
		loaiSanPham = sc.nextLine();
		laSanPhamMoi = sc.nextBoolean();
	}

	public SanPham(int maSanPham, String tenSanPham, String loaiSanPham, Boolean laSanPhamMoi) {
		this.maSanPham = maSanPham;
		this.tenSanPham = tenSanPham;
		this.loaiSanPham = loaiSanPham;
		this.laSanPhamMoi = laSanPhamMoi;
	}

	public String InThongTin() {
		String s = "san pham " + tenSanPham + " co ma san pham la " + maSanPham + " thuoc loai " + loaiSanPham + " , "
				+ laSanPhamMoi + " la san pham moi";
		return s;
	}
}
