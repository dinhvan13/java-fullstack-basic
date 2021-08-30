#include <conio.h>
#include <stdio.h>
#include <math.h>
int main()
{
	int a = 3, n = 10;
	int tong = 0;
	for(int i = 1; i <= n; i++)
	{   
	    
		if(i%a == 0)
		{
			tong += i;
			printf("%d\t",i);
		}
		
	}
	printf("\nTong cac so do la: %d\t",tong);
	
	
	_getch();
}
