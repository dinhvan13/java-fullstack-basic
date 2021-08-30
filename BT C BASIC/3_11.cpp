#include <conio.h>
#include <stdio.h>
#include <math.h>
int main()
{
	double SoPhutGoi =0, TongTien = 0, phi = 25000;
	printf("nhap so phut:\n");
	scanf("%lf",&SoPhutGoi);
	if(SoPhutGoi >=0)
	{
		if(SoPhutGoi <= 50)
		{
			TongTien = 600 * SoPhutGoi * 0.1 + phi;
			printf("tong tien dien thoai la: %.3f",TongTien);
		}
		else if(SoPhutGoi > 50 && SoPhutGoi <= 200)
		{
			TongTien = 600 * 50 * 0.1 + 400 * (SoPhutGoi - 50) * 0.1 + phi;
			printf("tong tien dien thoai la: %.3f",TongTien);
		}
		else
		{
			TongTien = (600 * 50 + 400 * 150) * 0.1 + 200 * (SoPhutGoi - 200) *0.1 + phi;
			printf("tong tien dien thoai la: %.3f",TongTien);
		}
	}
	else
	{
		printf("vui long nhap so phut lon hon bang 0!");
	}
	
}
