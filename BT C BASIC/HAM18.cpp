#include <conio.h>
#include <stdio.h>
#include <math.h>
int TimGiaTriNhoNhatBaSo(int a, int b,int c)
{
   if(a < b && a < c) return a;
   if(b < a && b < c) return b;
   return c;
}
int TaoSoFibonaci(int n)
{
  if(n == 1 || n == 2) 
  {
  	return 1;
  }
  else{
  	return TaoSoFibonaci(n-1)+TaoSoFibonaci(n-2);
  }
  
}
bool KiemTraFibonaci(int n)
{
	if(n < 0) return false;
	for(int i = 1;TaoSoFibonaci(i) <= n;i++)
	{
		
		if(TaoSoFibonaci(i) == n)
		{
			return true;
		}
	}
	return false;
	
}

//chuyen doi thap phan sang nhi phan
/*
long long DoiThapPhanSangNHiPhan(int x)
{
	long long sonhiphan = 0;
	int p = 0;
	while(x > 0)
	{
		sonhiphan += (x%2) *pow(10,p);
		++p;
		x/=2;
	}
	return sonhiphan;
}
*/
void ChuyenHeSo(int a[],int& n,int so)
{
	int x = so;
	for(int i = 0;pow(2,i-1) <= so;i++)
	{
		a[i] = x%2;
		x/=2;
		n=i;
	}
	for(int i = 0; i < n/2;i++)
	{
		int temp = a[i];
		a [i] = a[n-i-1];
		a[n-i-1] = temp;
	}
}

void XuatMang(int a[],int n)
{
	for(int i = 0; i < n; i++)
	{
		printf("%d",a[i]);
	}
}
int TimPhanTuXuatHienNhieuNhat(int a[], int n)
{
	int dem1 = 0, dem0 = 0;
	for(int i = 0;i < n; i++)
	{
		if(a[i] == 0)
		{
			dem0++;
		}
		else dem1++;
	}
	if(dem1 < dem0)
	{
		return 0;
	}
	else if(dem1 > dem0)
	{
		return 1;
	}
	else return -1;
}
int main()
{
  int a = 20, b= 10,c = 13;
  int min = TimGiaTriNhoNhatBaSo(a,b,c);
  printf("%d\n",min);
  if(KiemTraFibonaci(min) == true) 
  {
  	printf("la so thuoc day Fibonaci\n");
  	int arr[32],n;
  
  	ChuyenHeSo(arr,n,min);
    XuatMang(arr,n);
 
  
    int ptu = TimPhanTuXuatHienNhieuNhat(arr,n);
    if(ptu == -1)
    {
  	   printf("\n0 va 1 xuat hien so lan giong nhau");
    }
    else
   {
  	   printf("\nphan tu xuat hien nhieu nhat trong mang la %d",ptu);
   }
  }
  else
  {
  	printf("khong thuoc day fibonaci\n");
  }
  

}
