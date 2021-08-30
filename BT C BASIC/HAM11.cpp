#include <conio.h>
#include <stdio.h>
#include <math.h>
int UCLN(int a,int b)
{
	while(a != b)
	{
		if(a > b)
		{
			a -= b;
		}
		else
		{
			b -= a;
		}
	}
	return a;
}
int UCLNCMang(int a[], int n)
{
	int ucln = a[0];
	for(int i = 1; i < n; i++)
	{
		ucln = UCLN(ucln,a[i]);
	}
	return ucln;
}
int main()
{
	int a[] = {2,4,6,5,7};
	int n = 5;
    printf("ucln cua cac phan tu trong mang la %d",UCLNCMang(a,n));
}
