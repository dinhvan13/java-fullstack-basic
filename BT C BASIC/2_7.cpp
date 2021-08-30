#include <conio.h>
#include <stdio.h>
#include <math.h>
int main()
{
	int a = 3, b = 6;
	double tong = a + b *1.0;
	double hieu = a - b*1.0;
	double tich = a*b*1.0;
	double thuong = a/(b*1.0);
	int chia_du = a%b;
	printf("Ket qua cac phep tinh la:\nTong a+b= %lf\tHieu a-b= %lf\tTich a*b= %lf\tThuong a/b= %lf\tPhep chia co du cua a va b = %d",tong,hieu,tich,thuong,chia_du);
	_getch();
}
