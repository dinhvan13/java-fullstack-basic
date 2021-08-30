package HDT;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TapChi extends TaiLieu {
	private String tenTapChi;
	private int soPhatHanh, thangPhatHanh;

	public String getTenTapChi() {
		return tenTapChi;
	}

	public void setTenTapChi(String tenTapChi) {
		this.tenTapChi = tenTapChi;
	}

	public int getSoPhatHanh() {
		return soPhatHanh;
	}

	public void setSoPhatHanh(int soPhatHanh) {
		this.soPhatHanh = soPhatHanh;
	}

	public int getThangPhatHanh() {
		return thangPhatHanh;
	}

	public void setThangPhatHanh(int thangPhatHanh) {
		this.thangPhatHanh = thangPhatHanh;
	}

	private Scanner sc = new Scanner(System.in);

	public void NhapThongTin() {
		Nhap();
		System.out.println("nhap ten tap chi, so phat hanh,thang phat hanh");
		setTenTapChi(sc.nextLine());
		setSoBanPhatHanh(sc.nextInt());
		setThangPhatHanh(sc.nextInt());
	}

	public void InThongTin() {
		HienThiThongTin();
		System.out.println(
				"ten tap chi" + tenTapChi + ",so phat hanh " + soBanPhatHanh + " ,thang phat hanh : " + thangPhatHanh);
	}

	public static List<TapChi> TimKiemTapChi(List<TapChi> lst, String ten) {
		List<TapChi> lstResult = new ArrayList<TapChi>();
		lst.forEach(x -> {
			if (x.getTenTapChi().contains(ten))
				lstResult.add(x);
		});
		return lstResult;
	}
}
