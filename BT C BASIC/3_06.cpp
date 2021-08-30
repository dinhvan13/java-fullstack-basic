#include <conio.h>
#include <stdio.h>
#include <math.h>
int main()
{
	int a = 0;
	printf("nhap vao so a:\n");
	scanf("%d",&a);
	if(a >= 1 && a <=100)
	{
		if(a%3 == 0 && a%5 == 0)
		{
			printf("%d chia het cho 3 va 5",a);
		}
		else if(a%5 == 0)
		{
			printf("%d chia het cho 5",a);
		}
		else if(a%3 == 0)
		{
			printf("%d chia het cho 3 ",a);
		}
		else
		{
			printf("khong chia het cho 3 va 5");
		}
	}
	else
	{
		printf("khong thoa man gia tri dau vao!");
	}
	_getch();
}
