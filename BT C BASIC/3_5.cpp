#include <math.h>
#include <conio.h>
#include <stdio.h>
int main()
{
	float a = 1, b =-3, c = 2;
	float delta = b*b - 4*a*c;
	if(a == 0)
	{
		if(b == 0)
		{
			if(c == 0)
			{
				printf("phuong trinh co vo so nghiem");
			}
			else
			{
				printf("phuong trinh vo nghiem");
			}
		}
		else
		{
			printf("phuong trinh co mot nghiem x = %lf",-c/b);
		}
	 	//printf("phuong trinh co nghiem");
	}
	 else
	 {
	 	if(delta == 0)
	 	{
		    printf("phuong trinh co nghiem kep x1= x2 = %lf ",-b/(2*a));
		}
		else if(delta > 0 )
		{
			double x1 = (-b+sqrt(delta))/(2*a);
			double x2 = (-b-sqrt(delta))/(2*a);
			printf("phuong trinh co hai nghiem phan biet x1 = %lf\t\tx2 = %lf\t\t",x1,x2);
		}
		else
		{
			printf("phuong trinh vo nghiem");
		}
	 	
	 	
	 } 
	_getch();
}
