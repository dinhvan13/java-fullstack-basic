#include <conio.h>
#include <stdio.h>
#include <math.h>
int main()
{
	int a[] = {1,3,5,7};
	int b[] = {2,4,6,8,10};
	int c[9];
	int n = 4, m = 5,o =9,k = 0;
	for(int i = 0; i<n;i++)
	{
		c[k++] = a[i];
	}
	for(int j = 0;j < m;j++)
	{
		c[k++] = b[j];
	}
	for(int i = 0; i < o - 1;i++)
	{
		int temp = 0;
		for(int j = i+1;j < o;j++)
		{
			if(c[i] > c[j])
			{
				temp = c[j];
				c[j] = c[i];
				c[i] = temp;
			}
		}
	
	}
	for(int i = 0;i<o;i++)
	{
		printf("%d ",c[i]);
	}
	
	
	
	
}
