#include <conio.h>
#include <stdio.h>
#include <math.h>
int main()
{
	int a = 4, b = 5;
	for(int i = 0; i<a;i++)
	{
		for(int j = 0; j < b; j++)
		{
			if(i == 0 || j == 0 || i == a-1 || j == b-1)
			{
				printf("*");
			}
			else
			{
				printf(" ");
			}
			
			
		}
		printf ("\n");
	}
	_getch();
}
