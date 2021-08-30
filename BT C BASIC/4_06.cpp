#include <conio.h>
#include <stdio.h>
#include <math.h>
int main()
{
	int n = 4;
	for(int i = 0; i < n;i++)
	{
		for(int j = 0; j <= i; j++)
		{
			printf("*");
		}
		printf("\n");
	}
	_getch();
}
