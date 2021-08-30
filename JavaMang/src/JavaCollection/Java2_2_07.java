package JavaCollection;

public class Java2_2_07 {
public static void main(String[] args) {
	String chuoi = "Hvit Clan number one";
	char kitu = 'e';
	int dem = 0;
	for(int i = 0; i<chuoi.length();i++)
	{
		
		if(chuoi.charAt(i) == kitu)
		{
			dem++;
		}
	}
	System.out.println("ky tu e xuat hien "+dem+" lan trong chuoi");
}
}
