#include <conio.h>
#include <stdio.h>
#include <math.h>
bool KiemTraSoNguyenTo(int n)
{
	if(n < 2)
	{
		return false;
	}
	else if(n > 2)
	{
		if(n%2 == 0)
		{
			return false;
		}
		for(int i = 3; i < sqrt((float)n); i++)
		{
			if(n%i == 0)
			{
				return false;
			}
		}
	}
	return true;
}
void HienThi(int a[],int n)
{
	int dem = 0;
	for(int i = 0; i < n; i++)
	{
		if(KiemTraSoNguyenTo(a[i]))
		{
			printf("%d ",a[i]);
			dem++;
		}
	}
	if(dem == 0)
	{
		printf("khong co so nguyen to nao trong mang");
	}
	
}
int main()
{
	int arr [] = {2,3,4,5,6,7};
	HienThi(arr,6);

	
}
