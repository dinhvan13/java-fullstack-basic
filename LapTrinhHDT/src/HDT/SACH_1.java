package HDT;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SACH_1 extends TapChi {
	private String tenSach, tenTacGia;
	private int soTrang;
	private Scanner sc = new Scanner(System.in);

	public String getTenSach() {
		return tenSach;
	}

	public void setTenSach(String tenSach) {
		this.tenSach = tenSach;
	}

	public String getTenTacGia() {
		return tenTacGia;
	}

	public void setTenTacGia(String tenTacGia) {
		this.tenTacGia = tenTacGia;
	}

	public int getSoTrang() {
		return soTrang;
	}

	public void setSoTrang(int soTrang) {
		this.soTrang = soTrang;
	}

	public void NhapThongTin() {
		Nhap();
		System.out.println("nhap ten sach, ten tac gia,so trang ");
		setTenSach(sc.nextLine());
		setTenTacGia(sc.nextLine());
		setSoTrang(sc.nextInt());
	}

	public void InThongTin() {
		HienThiThongTin();
		System.out.println("ten sach " + tenSach + ",ten tac gia " + tenTacGia + " ,so trang : " + soTrang);
	}

	public static List<SACH_1> TimKiemSach(List<SACH_1> lst, String ten) {
		List<SACH_1> lstResult = new ArrayList<SACH_1>();
		lst.forEach(x -> {
			if (x.getTenSach().contains(ten))
				lstResult.add(x);
		});
		return lstResult;
	}
}
