package JavaHam;



public class Java3_2_07 {
	public static int DemSoLanXuatHien(int so,int b)
	{
		int dem = 0;
		 while (so>0) {
			dem = (so%10 == b)?dem+1:dem;
			so/=10;
		}
		 return dem;
	}

public static void main(String[] args) {
	 int a[]= {0,1,2,3,4,5,6,7,8,9};
	 int n = 10;
	 int so = 23456;
	 for(int i = 0;i < a.length;i++)
	 {
		 int solanxh = DemSoLanXuatHien(so, a[i]);
		
		 System.out.println(a[i]+" "+solanxh);
		 a[i] = solanxh;
		 
		 if(a[i]!=0) {
			 int tg = a[0];

			 for(int j = i+1;j<a.length;j++)
			 {
				 if(a[i] > a[j])
				 {
					 tg = a[i];
					 a[i] = a[j];
					 a[j] = tg;
				 }
			 }
		 }

	 }
	 
	 
	
	 
	 //int b = 456666;
	//System.out.println(DemSoLanXuatHien(b,6));
}
}
