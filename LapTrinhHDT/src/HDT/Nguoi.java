package HDT;

import java.time.LocalDate;
import java.util.Scanner;

public class Nguoi {
	private int MaSo;
	private String HoTen, Ho, Dem, Ten;
	private LocalDate NgaySinh;

	public int getMaSo() {
		return MaSo;
	}

	public void setMaSo(int maSo) {
		MaSo = maSo;
	}

	public String getHoTen() {
		return HoTen;
	}

	public String getHo() {
		setHoDemTen();
		return Ho;
	}

	public String getDem() {
		setHoDemTen();
		return Dem;
	}

	private void setHoDemTen() {
		String[] arr = HoTen.split(" ");
		Ho = arr[0];
		Ten = arr[arr.length - 1];
		Dem = "";
		for (int i = 1; i < arr.length-1 ; i++) {
			Dem += arr[i] + " ";
		}

	}

	public void setHoTen(String hoTen) {
		HoTen = hoTen;
	}

	public String getTen() {
		setHoDemTen();
		return Ten;
	}

	public LocalDate getNgaySinh() {
		return NgaySinh;
	}

	public void setNgaySinh(LocalDate ngaySinh) {
		NgaySinh = ngaySinh;
	}

	private Scanner sc = new Scanner(System.in);

	public Nguoi() {
		System.out.println("nhap thong tin ma so, hoc ten, ngay sinh cua hoc sinh: ");
		MaSo = sc.nextInt();
		sc.nextLine();
		HoTen = TaoDuLieuHoTen(sc.nextLine());
		setHoDemTen();
		//sc.nextLine();
		NgaySinh = LocalDate.parse(sc.nextLine());
	}

	public Nguoi(int maSo, String hoTen, LocalDate ngaySinh) {
		this.MaSo = maSo;
		this.HoTen = TaoDuLieuHoTen(hoTen);
		this.NgaySinh = ngaySinh;
	}
    
	public void InThongTin() {
		System.out.println(MaSo + " co ten la " + HoTen + " sinh ngay " + NgaySinh);
	}
	private String TaoDuLieuHoTen(String ht)
	{
		if(HoTen== null || ht.compareTo(HoTen)!= 0)return ht;
		return HoTen;
	}
}
