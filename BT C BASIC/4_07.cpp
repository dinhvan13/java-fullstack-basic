#include <conio.h>
#include <stdio.h>
#include <math.h>
int main()
{
	int a = 2346777, count = 0;
	while(a > 0)
	{
	   count++;
       a = a/10;

		
	}
	//for(int i = a; i > 0;i/=10)
	printf("%d",count);
	
	
	_getch();
}
