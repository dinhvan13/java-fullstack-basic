#include <conio.h>
#include <stdio.h>
#include <math.h>
bool LaSoNguyenTo(int n)
{
	if(n < 2) return false;
	if(n == 2 || n == 3 || n == 5) return true;
	if(n%2 == 0) return false;
	for(int i = 3; i < n;i++)
	{
		if(n%i == 0) return false;
	}
	return true;
}
int TimGTLNCMang(int a[],int n)
{
	int max = a[0];
	for(int i = 0; i < n;i++)
	{
		if(max < a[i])
		{
			max = a[i];
		}
	}
	return max;
}

int TimSoNguyenTo(int a[], int n)
{
	 int max = TimGTLNCMang(a,n) +1;
	 while(max > 0)
	 {
	 	
	 	if(LaSoNguyenTo(max))
	 	{
	 		return max;
		 }
		 max++;
	 }
    
}

int main()
{
	int a[] = {1,2,6,8,5,4};
	int n = 6;
	printf("so nguyen to nho nhat lon hon moi gia tri trong mang la %d",TimSoNguyenTo(a,n));
}
