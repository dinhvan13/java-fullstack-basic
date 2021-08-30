#include <conio.h>
#include <stdio.h>
#include <math.h>
void InTamGiac(int n)
{
	for(int i = 1;i <= n; i++)
	{
		for(int j = 1;j <= 2*i-1;j++)
		{
			printf("*");
		}
		printf("\n");
	}
}
int main()
{
	int n = 6;
	InTamGiac(n);
}
