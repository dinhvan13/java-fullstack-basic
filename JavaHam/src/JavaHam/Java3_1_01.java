package JavaHam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Java3_1_01 {
	// ham 1: duyet tren list xong add vao set
	public static void ChuyenListToSet(List<Integer> lst) {
		Set<Integer> set = new HashSet<Integer>();
		for (Integer x : lst) {
			set.add(x);
		}
		System.out.println("set tao thanh la: ");
		for (Integer x : set) {
			System.out.print(x + " ");
		}
	}

	// ham 2: su dung hash set constuctor
	public static void ChuyenListToSet1(List<Integer> lst) {
		Set<Integer> set = new HashSet<Integer>(lst);
		System.out.println("set tao thanh la: ");
		for (Integer x : set) {
			System.out.print(x + " ");
		}
	}

	// ham 3: su dung phuong thuc addall
	public static void ChuyenListToSet2(List<Integer> lst) {
		Set<Integer> set = new HashSet<Integer>(lst);
		set.addAll(lst);
		System.out.println("set tao thanh la: ");
		for (Integer x : set) {
			System.out.print(x + " ");
		}
	}

	// ham 4: su dung stream trong java
	public static void ChuyenListToSet3(List<Integer> lst) {
		Set<Integer> set = lst.stream().collect(Collectors.toSet());
		System.out.println("set tao thanh la: ");
		for (Integer x : set) {
			System.out.print(x + " ");
		}
	}

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 4, 6, 7, 8, 9, 2, 0);

		ChuyenListToSet3(list);

	}
}
