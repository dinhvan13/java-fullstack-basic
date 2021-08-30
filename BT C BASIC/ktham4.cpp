#include <conio.h>
#include <stdio.h>
#include <math.h>
void NhapMang(int a[],int n)
{
	for(int i = 0;i < n;i++)
	{
		printf("nhap phan tu thu a[%d] = ",i);
        scanf("%d",&a[i]);
	}
}
int DaoNguocSo(int n)
{
	int sodao = 0, r = 0;
	while(n > 0)
	{
		r = n % 10;
		sodao = sodao * 10 + r;
		n/=10;
	}
	return sodao;
}
bool KiemTraSoDoiXung(int n)
{
	if(n == DaoNguocSo(n))
	{
		return true;
	}
	return false;
}
int TongSoDoiXungTrongMang(int a[],int n)
{
	int tong = 0;
	 for(int i = 0; i< n;i++ )
	 {
	 	if(KiemTraSoDoiXung(a[i]) == true)
	 	{
	 		tong+=a[i];
		 }
	 }
	 return tong;
	
}
int main()
{ 
  int a[10] = {0}, n = 0;
   printf("nhap so phan tu cua mang");
   scanf("%d",&n);
   NhapMang(a,n);
   printf("Tong so doi xung trong mang la %d",TongSoDoiXungTrongMang(a,n));

	
}
