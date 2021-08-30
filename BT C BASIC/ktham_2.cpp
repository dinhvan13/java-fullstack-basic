#include <conio.h>
#include <stdio.h>
#include <math.h>
int main()
{
	int a[] = {1,2,3,4,5,6,7,8,9,0};
	int n = 10;
	//in cac phan tu trong mang
	printf("cac phan tu trong mang la:");
	for(int i = 0; i < n;i++)
	{
		printf("%d ",a[i]);
	}
	printf("\ncac phan tu chan trong mang la:");
	//in cac phan tu chan trong mang
	for(int i = 0;i < n; i++)
	{
		if(a[i]%2 == 0)
		{
			printf("%d ",a[i]);
		}
	}
	//in cac phan tu chia het cho 3 hoac 5
	printf("\ncac phan tu chia het cho 3 hoac 5 la:");
	for(int i = 0; i<n;i++)
	{
		if(a[i]%3 == 0 || a[i]%5 == 0)
		{
			printf("%d ",a[i]);
		}
	}
}
