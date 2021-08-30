package HDT;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TruyenTranh extends TaiLieu {
	private String tenTruyen;
	private LocalDate ngayPhatHanh;
	private Scanner sc = new Scanner(System.in);

	public void NhapThongTin() {
		Nhap();
		System.out.println("nhap ten truyen, ngay phat hanh ");
		setTenTruyen(sc.nextLine());
		setNgayPhatHanh(LocalDate.parse(sc.nextLine()));
	}

	public String getTenTruyen() {
		return tenTruyen;
	}

	public void setTenTruyen(String tenTruyen) {
		this.tenTruyen = tenTruyen;
	}

	public LocalDate getNgayPhatHanh() {
		return ngayPhatHanh;
	}

	public void setNgayPhatHanh(LocalDate ngayPhatHanh) {
		this.ngayPhatHanh = ngayPhatHanh;
	}

	public void InThiThongTin() {
		HienThiThongTin();
		System.out.println("ten truyen: " + tenTruyen + "\nngay phat hanh: " + ngayPhatHanh);
	}

	public static List<TruyenTranh> TimKiemTruyenTranh(List<TruyenTranh> lst, String ten) {
		List<TruyenTranh> lstResult = new ArrayList<TruyenTranh>();
		lst.forEach(x -> {
			if (x.getTenTruyen().contains(ten))
				lstResult.add(x);
		});
		return lstResult;
	}
}
