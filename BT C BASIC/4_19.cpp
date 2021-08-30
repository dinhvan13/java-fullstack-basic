#include <conio.h>
#include <stdio.h>
#include <math.h>
int main()
{
	int n = 0,tong = 0;
	printf("nhap so n: \n");
	scanf("%d",&n);
	printf("so vua nhap la :%d",n);
	printf("\ncac so le trong khoang tu 1 den %d la:",n);
	for(int i = 1; i <= n; i++ )
	{
		if(i%2 != 0)
		{
			printf("\t%d",i);
			tong += i;
		}
	
	}
	printf("\ngia tri cua tong cac so le la: %d",tong);
	
	if(tong%3 == 0)
	{
		printf("\n%d",tong/3);
	}
	else
	{
		printf("\n%d",tong-10);
	}
	_getch();
	
}
