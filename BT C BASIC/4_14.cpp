#include <stdio.h>
#include <conio.h>
#include <math.h>
int main()
{
	int a = 4;
	double tong  = 0;
	for(int i = 1; i <= a; i++)
	{
		int count = 0;
		for(int j = 1; j <= i; j++)
		{
			if(i%j == 0)
			{
				count ++;
			}
		}
		if(count == 2)
			{
				tong += 1/(i*1.0);
			}
      
	}
	printf("tong cua day so la:%lf",tong);	
    _getch();
	
}
