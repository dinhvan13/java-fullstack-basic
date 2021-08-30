#include <conio.h>
#include <stdio.h>
#include <math.h>
//ham nhap mang
int* NhapMang(int a[], int n)
{
	for(int i = 0; i < n; i++)
	{
		printf("nhap phan tu thu a[%d] ",i);
		scanf("%d",&a[i]);
	}
	return a;
}
//ham xuat mang
void XuatMang(int a[], int n)
{
	for(int i = 0; i < n; i++)
	{
		printf("%d ",a[i]);
	}
}
//ham sap xep mang
void SapXepMang(int a[], int n)
{
	for(int i = 0; i < n - 1; i++)
	{
		int temp = 0;
		for(int j = i +1; j <=n;j++)
		{
			if(a[i] > a[j])
			{
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}	
	}
	
}

int main()
{
    int n = 0;
	printf("Nhap so phan tu cua mang ");
	scanf("%d",&n);
	int*a = new int[n];
	a = NhapMang(a,n);
	XuatMang(a,n);
	printf("\n");
	SapXepMang(a,n);
	XuatMang(a,n);
	
}
