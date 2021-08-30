package JavaHam;

import java.util.Scanner;

public class Java3_1_05 {
	public static String LayKiTuGiuaChuoi(String chuoi) {
		int length;
		int position;
		if(chuoi.length()%2==0) {
			position = chuoi.length()/2-1;
			length = 2;
		}
		else {
			position = chuoi.length()/2;
			length = 1;
		}
		return chuoi.substring(position,position+length);
	}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("nhap vao chuoi: ");
    String str = sc.nextLine();
	System.out.println("ky tu o giua chuoi la: " + LayKiTuGiuaChuoi(str));
}
}
