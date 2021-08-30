#include <conio.h>
#include <stdio.h>
#include <math.h>
int main()
{
	int a =6, b = 18, ucln,min;
	/*if(a < b)
	{
		min = a;
	}
	else
	{
		min = b;
	}
	for(int i = min; i > 0; i--)
	{
		if(a%i == 0 && b%i == 0)
		{
		  ucln = i;
		  break;
	    }
		
	}*/
	
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
	ucln = a;
	
	  

	printf("ucnl la : %d",ucln);
	_getch();
}
