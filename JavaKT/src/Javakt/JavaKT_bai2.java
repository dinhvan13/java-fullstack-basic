package Javakt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class JavaKT_bai2 {
	private static Scanner sc = new Scanner(System.in);

	/// ham nhap list mot chieu
	public static void NhapListMotChieu(List<Integer> lst, int n) {
		System.out.println("nhap so phan tu cua list ");
		for (int i = 0; i < n; i++) {
			System.out.println("Nhap list tai vi tri " + i);
			lst.add(sc.nextInt());
		}
	}

	/// ham nhap list hai chieu
	public static void NhapListHaiChieu(List<List<Integer>> collection, int m) {
		for (int i = 0; i < m; i++) {
			System.out.println("nhap so phan tu cua list mot chieu ");
			int n = sc.nextInt();
			List<Integer> lst = new ArrayList<Integer>(n);
			NhapListMotChieu(lst, n);
			collection.add(lst);

		}
	}

	/// ham tinh gia tri trung binh cong cua list mot chieu
	public static int TinhGiaTriTrungBinhCong(List<Integer> lst) {
		int tong = 0;
		for (int i = 0; i < lst.size(); i++) {
			tong += lst.get(i);
		}
		return tong / lst.size();
	}

	/// ham sap xep dua theo trung binh cong cua tung list mot chieu
	public static void SapXepListHaiChieu(List<List<Integer>> collection) {
		for (int i = 0; i < collection.size() - 1; i++) {
			for (int j = i + 1; j < collection.size(); j++) {
				if (TinhGiaTriTrungBinhCong(collection.get(i)) < TinhGiaTriTrungBinhCong(collection.get(j))) {
					Collections.swap(collection, i, j);
				}
			}
		}
	}

	/// ham xuat list hai chieu
	public static void XuatListHaiChieu(List<List<Integer>> collection) {
		for (int i = 0; i < collection.size(); i++) {
			System.out.println(collection.get(i));
		}
	}

	public static void main(String[] args) {
		int m = 0;
		System.out.println("Nhap so luong phan tu cua list ");
		m = sc.nextInt();
		List<List<Integer>> lst = new ArrayList<List<Integer>>(m);
		NhapListHaiChieu(lst, m);
		SapXepListHaiChieu(lst);
		XuatListHaiChieu(lst);
	}
}
