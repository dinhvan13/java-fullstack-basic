package JavaArray;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class JavaArr2_1_01 {
	public static void main(String[] args) {
		// dung list
		List<String> danhsachTen = new Vector<String>();
		danhsachTen.add("nguyen dinh van");
		danhsachTen.add("nguyen dinh an");
		danhsachTen.add("nguyen anh tu");
		danhsachTen.add("nguyen thi hai");
		danhsachTen.add("nguyen dinh toan");
		danhsachTen.add("ngo xuan tho");
		System.out.println("so luong phan tu trong list la : " + danhsachTen.size());
		// dung set
		Set<String> danhsachTen1 = new HashSet<String>();
		danhsachTen1.add("nguyen dinh van");
		danhsachTen1.add("nguyen dinh van");
		danhsachTen1.add("nguyen anh tu");
		danhsachTen1.add("nguyen thi hai");
		danhsachTen1.add("nguyen dinh van");
		danhsachTen1.add("ngo xuan tho");
		System.out.println("so luong phan tu trong set la : " + danhsachTen1.size());

	}
}
