package HDT;

import java.util.Scanner;

public class MaTran {
	private int soHang, soCot;
	private int[][] matrrix = new int[100][100];

	public int[][] getMatrrix() {
		return matrrix;
	}

	public void setMatrrix(int[][] matrrix) {
		this.matrrix = matrrix;
	}

	public int getSoHang() {
		return soHang;
	}

	public void setSoHang(int soHang) {
		this.soHang = soHang;
	}

	public int getSoCot() {
		return soCot;
	}

	public void setSoCot(int soCot) {
		this.soCot = soCot;
	}

	private Scanner sc = new Scanner(System.in);

	public MaTran() {
		System.out.println("vui long nhap so hang ");
		setSoHang(sc.nextInt());
		System.out.println("vui long nhap so cot ");
		setSoCot(sc.nextInt());
		setMatrrix(NhapMaTran(matrrix, soHang, soCot));
	}

	public MaTran(int sohang, int socot, int[][] mt) {

		setSoHang(sohang);
		setSoCot(socot);
		setMatrrix(mt);

	}

	public int[][] NhapMaTran(int[][] mt, int sohang, int socot) {
		for (int i = 0; i < sohang; i++) {
			for (int j = 0; j < socot; j++) {
				System.out.println("matrix[ " + i + " ][ " + j + " ]: ");
				mt[i][j] = sc.nextInt();
			}
		}
		return mt;
	}

	public MaTran CongHaiMaTran(MaTran mt) {
		if (soHang != mt.soHang || soCot != mt.soCot) {
			System.out.println("vui long nhap hai ma tran co cung so hang va so cot !");
			return null;
		} else {
			MaTran mtResult = new MaTran(soHang, soCot, new int[soHang][soCot]);
			for (int i = 0; i < soHang; i++) {
				for (int j = 0; j < soCot; j++) {
					mtResult.matrrix[i][j] = matrrix[i][j] + mt.matrrix[i][j];
				}
			}
			return mtResult;
		}

	}

	public void InMaTran() {
		for (int i = 0; i < soHang; i++) {
			for (int j = 0; j < soCot; j++) {
				System.out.print(matrrix[i][j] + " ");
			}
			System.out.println("");
		}
	}

}
