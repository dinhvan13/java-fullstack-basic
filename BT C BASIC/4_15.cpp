#include <conio.h>
#include <stdio.h>
#include <math.h>
int main()
{
	int n = 2;
	double tong = 0;
	for(int i = 1; i<=n; i++)
	{ 
	    
		if(i%2 == 0)
		{
			int gt = 1;	
			for(int j = 1; j<=i;j++)
			{
			
		
				gt *= j;
			
			
			}
			tong += 1/(gt*1.0);
		}
		
		
		
	}
	printf("tong nghich dao giai thua %lf",tong);
	_getch();
}
