package Javakt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.sound.midi.Soundbank;

public class JavaKT {
	/// ham viet hoa chuoi den n
	public static List<String> VietHoaDenN(List<String> list, int n) {
		n = list.size();
		// System.out.println(a);

		for (int i = 0;i<n; i++) {
			String temp = list.get(i);
			if (temp.length() > n) {
				temp=temp.substring(0, n).toUpperCase() + " " + temp.substring(n + 1);
				///System.out.println(i);
			} else {
				temp=temp.toUpperCase();
				
			}
			list.set(i, temp);
		}
		///InDanhSach(list);
		return list;
	}

///ham sap xep danh sach chuoi theo thu tu giam dan
	public static List<String> SapXepDanhSach(List<String> list) {
		//Collections.sort(list);
		//Collections.reverse(list);
		for(int i = 0; i<list.size()-1;i++)
		{
			for(int j = i+1; j<list.size();j++) {
				if(list.get(i).length()< list.get(j).length()) {
					Collections.swap(list, i, j);
				}
			}
		}
		return list;
	}

///ham in ra danh sach chuoi
	public static void InDanhSach(List<String> lst) {
		for (int i = 0; i < lst.size(); i++) {
			if(i == lst.size()-1)
			{
				System.out.println(lst.get(i)+" ");
			}
			else
			{
				System.out.println(lst.get(i) + ", ");
			}
				

			
		}
	}

	public static void main(String[] args) {
		List<String> lst = new ArrayList<String>();
		lst.add("hoc lap trinh");
		lst.add("ho");
		lst.add("hoc lap trinh pro");
		System.out.println("Chuoi viet hoa den n la: ");
		int n = lst.size();
		
		InDanhSach(VietHoaDenN(lst, n));
		VietHoaDenN(lst, n);
		System.out.println("\nChuoi sau khi sap xep  la: ");
		SapXepDanhSach(lst);
		InDanhSach(lst);

	}
}
