package HDT;

import java.util.Calendar;
import java.util.Scanner;

public class ThoiGian {
	private int ngay, thang, nam, thu;
	private Boolean laNamNhuan = false;
	Calendar c = Calendar.getInstance();

	public int getNgay() {
		return ngay;
	}

	public void setNgay(int ngay) {
		this.ngay = ngay;
		c.set(nam, thang - 1, ngay);
		thu = c.get(Calendar.DAY_OF_WEEK);
	}

	public int getThang() {
		return thang;
	}

	public void setThang(int thang) {
		this.thang = thang;
	}

	public int getNam() {
		return nam;
	}

	public void setNam(int nam) {
		this.nam = nam;
		if (this.nam % 4 == 0 && this.nam % 100 != 0 || this.nam % 400 == 0) {
			laNamNhuan = true;
		} else {
			laNamNhuan = false;
		}

	}

	public int getThu() {
		return thu;
	}

	public void setThu(int thu) {
		this.thu = thu;
	}

	public Boolean getLaNamNhuan() {
		return laNamNhuan;
	}

	public void setLaNamNhuan(Boolean laNamNhuan) {
		this.laNamNhuan = laNamNhuan;
	}

	private Scanner sc = new Scanner(System.in);

	private int nhapSo(String msgNhap, String msgErr, int min, int max) {
		int so = 1;
		Boolean ok = false;
		do {
			try {
				System.out.println(msgNhap);
				so = sc.nextInt();
				ok = true;
				ok = ok && so >= min && so <= max;
			} catch (Exception e) {
				System.out.println(msgErr);
				sc.nextLine();
			}

		} while (!ok);
		return so;
	}

	public ThoiGian(int nam, int thang, int ngay) {
		setNgay(ngay);
		setThang(thang);
		setNam(nam);
	}

	public ThoiGian() {
		setNam(nhapSo("nhap nam", " ban vui long nhap nam tu 1000 den nay! ", 1000, c.get(Calendar.YEAR)));
		setThang(nhapSo("nhap thang", " ban vui long nhap thang trong khoang [1,12] ", 1, 12));
		if (thang == 2) {
			if (laNamNhuan) {
				setNgay(nhapSo("nhap ngay ", " ban vui long nhap trong khoang [1,29]", 1, 29));
			} else {
				setNgay(nhapSo("nhap ngay ", " ban vui long nhap trong khoang [1,28]", 1, 28));
			}
		} else if (thang == 4 || thang == 6 || thang == 9 || thang == 11) {
			setNgay(nhapSo("nhap ngay ", " ban vui long nhap trong khoang [1,30]", 1, 30));
		} else {
			setNgay(nhapSo("nhap ngay ", " ban vui long nhap trong khoang [1,31]", 1, 31));
		}

	}

	public long LayKhoangThoiGian(ThoiGian tg) {
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		c1.set(nam, thang - 1, ngay);
		c2.set(tg.getNam(), tg.getThang() - 1, tg.getNgay());
		long n = Math.abs((c1.getTimeInMillis() - c2.getTimeInMillis()) / (24 * 60 * 60 * 1000));
		return n;
	}

	public String LayThongTin() {
		String s = "hom nay la thu " + thu + " , " + ngay + " / " + thang + " / " + nam + " / " + laNamNhuan
				+ " la nam nhuan ";
		return s;
	}
}
