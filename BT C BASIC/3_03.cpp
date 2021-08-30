#include <conio.h>
#include <stdio.h>
#include <math.h>
int main()
{
	int a = 3,b = 3, c = 4;
	//printf("%d",a == b == c);
	if(a<b+c || b<a+c || c<a+b)
	{
		if(a == b && b == c)
		{
			printf("3 canh tao thanh tam giac deu\n");
		}
		else if(a == b || b == c || c == a)
		{
			printf("3 canh tao thanh tam giac can\n");
		}
		else if(b*b == a*a+c*c || a*a == b*b+c*c || c*c == a*a+b*b)
		{
			printf("3 canh tao thanh tam giac vuong\n");
		}
		else
		{
			printf("no la tam giac thuong\n");
		}
	}
	else
	{
		printf("3 canh khong tao thanh tam giac!");
	}
	_getch();
}
