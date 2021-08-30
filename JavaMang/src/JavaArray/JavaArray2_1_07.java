package JavaArray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class JavaArray2_1_07 {
	public static void main(String[] args) {

		int m;
		System.out.println("nhap so luong phan tu");
		Scanner sc = new Scanner(System.in);
		m = sc.nextInt();
		List<List<Integer>> collection = new ArrayList<List<Integer>>(m);
		NhapListHaiChieu(collection, m);
		SapXepListHaiChieu(collection);
		XuatListHaiChieu(collection);
	}

	public static void NhapList(List<Integer> lst, int n) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < n; i++) {
			System.out.println("nhap list tai vi tri " + i);
			lst.add(sc.nextInt());

		}
	}

	public static void NhapListHaiChieu(List<List<Integer>> colletion, int m) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < m; i++) {
			System.out.println("nhap so luong phan tu cua list " + i);
			int n = sc.nextInt();
			List<Integer> lst = new ArrayList<Integer>(n);
			NhapList(lst, n);
			colletion.add(lst);

		}
	}

	public static void XuatListHaiChieu(List<List<Integer>> colletion) {
		for (int i = 0; i < colletion.size(); i++) {
			System.out.println(colletion.get(i));

		}
	}

	public static int TinhGiaTriTBCList(List<Integer> lst) {
		int tong = 0;
		for (int i = 0; i < lst.size(); i++) {
			tong += lst.get(i);
		}
		return tong / lst.size();
	}

	public static void SapXepListHaiChieu(List<List<Integer>> collection) {
		for (int i = 0; i < collection.size() - 1; i++) {
			for (int j = i + 1; j < collection.size(); j++) {
				if (TinhGiaTriTBCList(collection.get(i)) < TinhGiaTriTBCList(collection.get(j))) {
					Collections.swap(collection, i, j);
				}
			}
		}
	}

}
