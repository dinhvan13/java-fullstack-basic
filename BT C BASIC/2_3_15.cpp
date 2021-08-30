#include <conio.h>
#include <stdio.h>
#include <math.h>
int main()
{
	int a[] = {3,1,5,6};
	int b[] = {4,2,2,1,3,9};
	int c[10];
	int n = 4,m = 6,p = 10,k = 0;
	for(int i = 0; i< n; i++)
	{
		c[k++] = a[i];
	}
	for(int j = 0; j < m;j++)
	{
		c[k++] = b[j];
	}
	for(int i = 0; i < p;i++)
	{
		int temp = 0;
		for(int j = i+1;j < p;j++)
		{
		  if(c[i] > c[j])
		  {
		  	temp = c[j];
		  	c[j] = c[i];
		  	c[i] = temp;
		  }	
		}
	}
	for(int i = 0; i <p; i++)
	{
		printf("%d ",c[i]);
	}
   

	}

	
