#include <math.h>
#include <stdio.h>
#include <conio.h>
int main()
{
	int a = 1, b = 4, c = 10, d;
	d = a;
	a = b;
	b = c;
	c = d;
	printf("Gia tri sau khi hoan doi la:\n%d--%d--%d",a,b,c);
	_getch();
}
