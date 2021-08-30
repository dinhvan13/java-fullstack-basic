#include <conio.h>
#include <stdio.h>
#include <math.h>
int main()
{
	int a[] = {1,3,3,4,3,5,3,7};
	int n = 8;
	
	int gio[10] = {0}; 
	
	
	
	for(int i=0;i<n;i++)
	{
		gio[a[i]] ++;
	}
	int count = 0, d = 3;
	for(int i = 0;i<10;i++)
	{
		if(gio[i] > 0)
		{
			
			for(int k=0;k<gio[i];k++)
			{
				if(i == d)
				{
					count ++;
				}
			}
			
			
				
		}
		
		
			
			

	}
	printf("%d",count);

	
}
