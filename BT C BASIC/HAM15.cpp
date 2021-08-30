#include <conio.h>
#include <stdio.h>
#include <math.h>
double HieuHaiSo(double a, double b)
{
	if(a > b)
	{
		return a - b;
	}
	else
	{
		return b - a;
	}
	
}
double TimHaiGiaTriGanNhat(double a[],int n)
{
	double min = HieuHaiSo(a[1],a[0]);
	for(int i = 0; i < n - 1; i++)
	{
		for(int j = i+1; j < n;j++)
		{
			double hieu = HieuHaiSo(a[j],a[i]) ;
			if(hieu < min)
			{
				min = hieu;
			}
		}
	}
	return min;
}
void InGiaTriGanNhauNhat(double a[],int n)
{
	for(int i = 0; i < n - 1; i++)
	{
		for(int j = i +1; j < n; j++)
		{
			double hieu = HieuHaiSo(a[j],a[i]);
			if(hieu == TimHaiGiaTriGanNhat(a,n))
			{
				printf("(%lf %lf",a[i],a[j]);
				break;
			}
		}
	}
}
int main()
{
  double a[] = {1.1,3.2,2.1,2.3,1.2};
  int n = 5;
  InGiaTriGanNhauNhat(a,n);
}
