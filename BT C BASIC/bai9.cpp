#include <conio.h>
#include <stdio.h>
#include <math.h>
bool KiemTraSo(char n)
{
	if(n>= '0' && n <='9') return true;
	return false; 
}
int GhepSo(int n,char c)
{
	return n*10 + c - '0';
}
int DemKyTu(char a[])
{
	int dem = 0;
	for(int i = 0;a[i] != '\0';i++)
	{
		dem++;
	}
	return dem;
}
int TongChuoi(char a[])
{
	int tong = 0, so = 0, dem = DemKyTu(a);
	for(int i = 0; i <= dem;i++)
	{
		if(KiemTraSo(a[i]))
		{  
			so = GhepSo(so,a[i]);
		
		}
		
		
		else
		{
			tong+=so;
			so = 0;
		}
	}
	return tong;
}
bool laKiTuSoCuoi(char c, char *a, int n)
{
	for(int i=n-1;i>=0;i--)
	{
		if(KiemTraSo(c) == true)
		{
			return true;
		}
	}
	return false;
}

int main()
{
	char a[] = {'1','b','c','2','3','e','5','6','d'};
	int dem = DemKyTu(a);
	int so = 0;
	for(int i = 0; i < dem;i++)
	{
		if(KiemTraSo(a[i]))	{
			so = GhepSo(so,a[i]);
				
		}
		if(laKiTuSoCuoi(a[i],a,dem))
		{
			printf("%d =",so);
		}
		else {
			printf("%d +",so);
		}
	}
	int tong = TongChuoi(a);
	printf("\n%d",tong);
}
