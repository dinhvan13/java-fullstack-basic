#include <conio.h>
#include <stdio.h>
#include <math.h>
int main()
{
	int a = 23;
	printf("nhap so a:\n");
	scanf("%d",&a);
	int count = 0;
	while(a > 0)
	{
		int temp = a%10;
		printf("%d\n",temp);
		a = a/10;
		count += temp;
	}
	printf("tong cua cac so la:%d",count);
	
	_getch();
}
