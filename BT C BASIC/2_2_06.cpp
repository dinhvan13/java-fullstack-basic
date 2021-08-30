#include <conio.h>
#include <stdio.h>
#include <math.h>
int main()
{
	int a[] = {4,3,5,1,6,8,2};
	int n = 7;
	//int min = a[0],max = a[0];
	int temp = 0;
	for(int i = 0 ; i < n-1; i++)
	{
		for(int j = i + 1; j< n; j++)
		{
			if((a[i] >a[j]) && (a[i]%2 == 0 ) && (a[j]%2 == 0)) 
			{
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
			if((a[i] < a[j]) && (a[i]%2 != 0 ) && (a[j]%2 !=0))
			{
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		
	}
	for(int i = 0; i<n;i++)
	{
		printf("\t%d",a[i]);
	}
	
}
