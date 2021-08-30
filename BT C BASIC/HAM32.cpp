#include <conio.h>
#include <stdio.h>
#include <math.h>
int TongMangSoChan(int a[],int n);
char TimKiTuXuatHienNhieuNhat(char [],int n);
int UocChungLonNhatTrongMang(int a[],int n);
//char[] DoiChuoiThanhChuoiHoa(char[],int n);
int TimDoDaiChuoi(char []);
int SoDao(int a)
{
	int son = 0,r = 0;
	while(a != 0)
	{
	    r = a%10;
		son = (son*10) + r;
		a/=10; 
	}
	return son;
}
int main()
{
  	int a = 1234;
  	printf("%d",SoDao(a));
}
