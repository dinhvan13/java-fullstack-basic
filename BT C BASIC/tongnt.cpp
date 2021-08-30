#include <conio.h>
#include <stdio.h>
#include <math.h>
int main()
{
	int n = 4;
	double tong = 0;
	for(int i = 1;i<=n;i++)
	{
		int count = 0;
		for(int j = 1;j<=i;j++)
		{
		    
			if(i%j == 0)
			{
				count++;
			}
		
		}
		if(count == 2)
		{
			//printf("cac so nguyen to la :%d",i);
			tong += 1/(i*1.0);
		}

		
	}
	printf("tong nghich dao cac so nguyen to la:%lf",tong);
	
	
	
	_getch();
}
