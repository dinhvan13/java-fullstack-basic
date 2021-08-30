#include <conio.h>
#include <stdio.h>
#include <math.h>
int main()
{
	int a =4, b = 8,ucln, min;
	if(a < b)
	{
		min = a;
	}
	else
	{
		min = b;
	}
	for(int i = min; i > 0;i--)
	{
		if(a%i == 0 && b%i == 0)
		{
			ucln = i;
			break;
		}
	}
	int bcnn = (a*b)/ucln;
	printf("boi chung nho nhat cua 2 so la:%d",bcnn);
	_getch();
}
