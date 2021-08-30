#include <conio.h>
#include <stdio.h>
#include <math.h>
int* NhapMang(int a[],int n)
{
	for(int i = 0; i < n;i++)
	{
		printf("nhap phan tu thu a[%d] ",i);
		scanf("%d",&a[i]);
	}
    return a;
}
void XuatMang(int a[],int n)
{
	for(int i = 0;i < n; i++)
	{
		printf("%d",a[i]);
	}
}
int main()
{   
	int n;
    printf("nhap so phan tu cua mang");
	scanf("%d",&n);
	int*a = new int[n];	
	a = NhapMang(a,n);
	XuatMang(a,n);		
}
