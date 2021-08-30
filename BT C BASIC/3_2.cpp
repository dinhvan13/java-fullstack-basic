#include <math.h>
#include <conio.h>
#include <stdio.h>
int main()
{
	int a = 2016;
    if(a>=1000 && a<=2020)
    {
    	if(a%4==0 && a%100!=0 || a%400 == 0)
    	{
    	  printf(" la nam nhuan.");	
		}
		else
		{
		  printf("Khong la nam nhuan!");
		}
    	  
	}
	else
	{
		printf("Khong tinh duoc!");
	}
	_getch();
}
