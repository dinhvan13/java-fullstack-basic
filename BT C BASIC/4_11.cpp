#include <conio.h>
#include <stdio.h>
#include <math.h>
int main()
{
	//int gio = 00, phut = 00,giay = 00;
	for(int gio = 0;gio<24;gio++)
	{
		for(int phut = 0;phut<60; phut++)
		{
			for(int giay = 0;giay<60;giay++)
			{
				printf("%d : %d : %d\n",gio,phut,giay);
			}
		}
	}
	_getch();
}
