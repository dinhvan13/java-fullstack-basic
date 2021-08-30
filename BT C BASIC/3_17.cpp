#include <conio.h>
#include <stdio.h>
#include <math.h>
int main()
{
	float x = 0, bieuthuc = 0;
	printf("nhap gia tri cua x:\n");
	scanf("%lf",&x);
	if(x >= 5)
	{
		bieuthuc = 2*pow(x,2) + 5*x + 9;
		printf("gia tri cua bieu thuc: %lf",bieuthuc);
	}
	else
	{
		bieuthuc = -2*pow(x,2) + 4*x - 9;
		printf("gia tri cua bieu thuc: %lf",bieuthuc);
	}
	_getch();
}
