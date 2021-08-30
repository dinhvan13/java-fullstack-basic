#include <conio.h>
#include <stdio.h>
#include <math.h>
int main()
{
	int a[] = {11,22,-3333,4444,456788,345};
	int n = 6;
	
	printf("cac so nguyen duong la ");
	for(int i = 0;i < n;i++)
	{
		if(a[i] > 0)
		{
			printf("%d ",a[i]);
		}
	}
	printf("\ncac so nguyen duong va chia het cho 3 la ");
	for(int i = 0;i < n;i++ )
	{
		int count = 0;
		if(a[i] > 0)
		{
			for(int j = a[i];j > 0;j/=10)
			{
				count++;
	        }
			if(count%3 == 0)
			{
				printf("%d ",a[i]);		
			}		
			
				
			}
			
		}

	}

	
