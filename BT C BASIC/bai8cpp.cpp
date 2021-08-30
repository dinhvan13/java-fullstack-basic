#include <conio.h>
#include <stdio.h>
#include <math.h>
void NhapMang(int a[],int n)
{
	for(int i = 0;i < n;i++)
	{
		printf("nhap phan tu thu a[%d] ",i);
		scanf("%d",&a[i]);
	}
}

int TimSoNguoc(int n)
{
	int songuoc = 0,r = 0;
	while(n > 0)
	{
		r = n%10;
		songuoc = songuoc*10+r;
		n/=10;
	}
	return songuoc;
}
bool KiemTraSoDoiXungTrongMang(int n)
{
	
		if(n == TimSoNguoc(n))
		{
			return true;
		}
		else
		{
			return false;
		}
	
}
int TongMangSoDoiXung(int a[],int n)
{
	int tong = 0;
	for(int i = 0; i< n;i++)
	{
		if(KiemTraSoDoiXungTrongMang(a[i]) == true)
		{
			tong+= a[i];
		}
	}
	return tong;
	
}
int main()
{
  int a[10] = {0};
  int n;
  printf("nhap so phan tu cua mang ");
  scanf("%d",&n);
  NhapMang(a,n);
  int kq = TongMangSoDoiXung(a,n);
  printf("%d",kq);
  
}
