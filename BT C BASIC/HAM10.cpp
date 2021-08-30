#include <conio.h>
#include <stdio.h>
#include <math.h>
int UCLN(int a,int b)
{
	while(a != b)
	{
		if(a > b)
		{
			a -= b;
		}
		else
		{
			b -= a;
		}
	}
	return a;
}
int main()
{
	printf("%d",UCLN(10,20));
}
