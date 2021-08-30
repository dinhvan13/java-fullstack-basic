package JavaHam;

public class Java3_1_06 {
	public static long DemSoKhoangTrang(String c) {
		long dem = c.chars().filter(ch -> ch == ' ').count();
		return dem;
	}

	public static void main(String[] args) {
		String chuoi = "hoc it lap   trinh   ";
		long dem = DemSoKhoangTrang(chuoi);
		System.out.println(dem);
	}
}
