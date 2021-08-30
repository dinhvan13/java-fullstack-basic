#include <conio.h>
#include <stdio.h>
#include <math.h>
void InMang(int a[], int n)
{
	for(int i = 0; i < n;i++)
	{
		printf("%d",a[i]);
	}
}
void LocMang(int a[], int& n,int b[])
{
	for(int i = 0; i < n - 1; i++)
	{
		for(int j = i+1; j < n; j++)
		{
			if(a[i] == a[j])
			{
				for(int k = j; k < n - 1; k++)
				{
					a[k] = a[k+1];
				}
				n--;
				i--;	
			}
		}
	}
    for(int i = 0; i < n; i++)
    {
    	b[i] = a[i];
	}
	
}
int main()
{
  int a[] = {1,2,2,2,4,4,5,5,6,7};
  int n = 10, m = n,b[10];
  LocMang(a,m,b);
  InMang(b,m);
  
}
