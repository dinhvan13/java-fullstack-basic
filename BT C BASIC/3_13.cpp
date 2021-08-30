#include <conio.h>
#include <stdio.h>
#include <math.h>
int main()
{
    double DoanhSo = 0,HoaHong = 0;
    printf("vui long nhap doanh so cua cua hang:\n");
    scanf("%lf",&DoanhSo);
    if(DoanhSo <= 100000000)
	{
		HoaHong = DoanhSo*5/100;
	}
	else if(DoanhSo <= 300000000)
	{
		HoaHong = DoanhSo * 10/100;
	}
	else
	{
	    HoaHong = DoanhSo * 20/100;
	}
		printf("doanh so thu duoc la : %lf \nhoa hong nhan duoc la : %lf",DoanhSo,HoaHong);
	_getch();
}
