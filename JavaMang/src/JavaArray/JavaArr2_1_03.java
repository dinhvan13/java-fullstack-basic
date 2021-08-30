package JavaArray;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class JavaArr2_1_03 {
	public static void main(String[] args) {
		List<String> danhsachMon = new ArrayList<String>();
		danhsachMon.add("Toan");
		danhsachMon.add("Ly");
		danhsachMon.add("Hoa");
		danhsachMon.add("Van");
		danhsachMon.add("Anh");
		danhsachMon.add("Toan Cao Cap");
		danhsachMon.add("Sinh Hoa");
		System.out.println("danh sach cac mon hoc : " + danhsachMon);
		danhsachMon.remove(2);
		danhsachMon.add("Dia ly");
		System.out.println("danh sach mon sau khi bi xoa : " + danhsachMon);
		//dung set
		Set<String> danhsachMon1 = new HashSet<String>();
		danhsachMon1.add("Toan");
		danhsachMon1.add("Ly");
		danhsachMon1.add("Hoa");
		danhsachMon1.add("Van");
		danhsachMon1.add("Anh");
		danhsachMon1.add("Toan Cao Cap");
		danhsachMon1.add("Sinh Hoa");
		System.out.print("danh sach cac mon hoc : ");
		danhsachMon1.remove(2);
		danhsachMon1.add("Dia ly");
		
	   for (String monhoc : danhsachMon1) {
		  System.out.print(monhoc+" ");
	}



	}
}
