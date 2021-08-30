#include <conio.h>
#include <stdio.h>
#include <math.h>
int main()
{
	int n = 0;
	printf("nhap so nguyen n");
	scanf("%d",&n);
	int *a = new int[n];
	for(int i = 0; i < n; i++)
	{
		a[i] = 0;
		printf("%d",a[i]);
		
	}
	printf("\n");
	for(int i = n -1 ; i >= 0;i--)
	{
		if(a[i] == 0)
		{
			a[i] = 1;
			for(int j = i + 1; j < n; j++)
			{
				a[j] = 0;
			}
			for(int k= 0; k < n;k++)
			{
				printf("%d",a[k]);
			}
			printf("\n");
			i = n;
			// break;
		}
	}
	

	}

	
