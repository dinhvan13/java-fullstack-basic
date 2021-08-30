package HDT;

import java.util.Random;
import java.util.Scanner;

public class TroChoiXucXac {
	private int giaTri_1, giaTri_2;
	private Boolean thang = false, thua = false, hoa = false;

	public int getGiaTri_1() {
		return giaTri_1;
	}

	public void setGiaTri_1(int giaTri_1) {
		this.giaTri_1 = giaTri_1;
	}

	public int getGiaTri_2() {
		return giaTri_2;
	}

	public void setGiaTri_2(int giaTri_2) {
		this.giaTri_2 = giaTri_2;
		if (giaTri_2 > giaTri_1) {
			thua = true;
		} else if (giaTri_2 == giaTri_1) {
			hoa = true;
		} else {
			thang = true;
		}
	}

	public Boolean getThang() {
		return thang;
	}

	public Boolean getThua() {
		return thua;
	}

	public Boolean getHoa() {
		return hoa;
	}

	private Scanner sc = new Scanner(System.in);

	private int NhapGiaTri() {
		int so = 0;
		Boolean ok = false;
		do {
			try {
				System.out.println("vui long nhap gia tri muon dat cuoc ");
				so = sc.nextInt();
				ok = true;

			} catch (Exception e) {
				System.out.println("vui long nhap gia tri nguyen!");
				sc.nextLine();
			}
		} while (!ok);
		return so;
	}

	public void BatDau() {
		do {
			setGiaTri_1(NhapGiaTri());
			if (getGiaTri_1() < 3 || getGiaTri_1() > 18) {
				System.out.println("ket thuc!");
				return;
			}
			Random rd = new Random();
			int lan1 = rd.nextInt(6) + 1;
			int lan2 = rd.nextInt(6) + 1;
			int lan3 = rd.nextInt(6) + 1;
			System.out.println("ket qua : " + lan1 + " , " + lan2 + " , " + lan3 + " va tong " + (lan1 + lan2 + lan3));
			setGiaTri_2(lan1 + lan2 + lan3);
			InThongTin();
			thang = thua = hoa = false;

		} while (giaTri_2 >= 3 && giaTri_2 <= 18);
	}

	private void InThongTin() {
		if (thang) {
			System.out.println("nguoi choi thang!");
		} else if (hoa) {
			System.out.println("nguoi choi hoa! ");
		} else {
			System.out.println("nguoi choi thua! ");
		}
	}

}
