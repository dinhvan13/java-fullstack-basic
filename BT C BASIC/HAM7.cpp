#include <conio.h>
#include <stdio.h>
#include <math.h>
int* NhapMang(int a[], int n)
{
	for(int i = 0; i < n; i++)
	{
		printf("nhap phan thu a[%d]",i);
		scanf("%d",&a[i]);
	}
	return a;
}
void XuatMang(int a[], int n)
{
	for(int i = 0; i < n; i++)
	{
		printf("%d ",a[i]);
	}
}
int TimKiemPhanTuMang(int a[],int n,int b)
{   
    int index = -1;
	for(int i = 0; i < n; i++)
	{
		
		if(a[i] == b)
		{
		    index = i;
			break;
		}
		
	}
	return index;
}
int main()
{
  int n = 0, x = 4;
  printf("nhap so phan tu cua mang");
  scanf("%d",&n);
  int*a = new int[n];	
  a = NhapMang(a,n);
  XuatMang(a,n);
  int c = TimKiemPhanTuMang(a,n,x);
  if(c == -1)
  {
  	printf("\nkhong tim thay phan tu trong mang");
  }
  else
  {
  	printf("phan tu %d xuat hien dau tien o vi tri %d",x,c);
  }
  
}
