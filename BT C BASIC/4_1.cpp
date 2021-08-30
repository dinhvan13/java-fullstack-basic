#include <conio.h>
#include <stdio.h>
#include <math.h>
int main()
{
	printf("vui long nhap so can kiem tra:\n");
	int a;
	scanf("%d",&a);
	int dem = 0;

	for(int i = 1;i <=a;i++)
	{	
	    if(a%i == 0)
		  {
		  	dem++;
		  }
	}
	if(dem == 2)
		{
			printf("la so nguyen to");
		}
		else
		{
			printf("khong phai so nguyen to");
		}
		
	
		
	_getch();
}
