#include <conio.h>
#include <stdio.h>
#include <math.h>
int main()
{
	int a = 2, b = 10;
	for(int i = a;i <= b;i++)
	{
		if(i%2 == 0 )
		{
			printf("%d\t",i);
		}
	}
	_getch();
}
