#include <conio.h>
#include <stdio.h>
#include <math.h>
int main()
{
	int a[] = {1,2,6,3,4,28};
	int n = 6;
	int tong = 0;
	printf("cac so hoan hao la:");
	for(int i = 0;i < n;i++)
	{   
	    int count = 0;
		for(int j = 1;j < a[i];j++)
		{
			if(a[i] %j == 0)
			{
				count+=j;
			}
		}
		if(a[i] == count)
		{
            printf("%d\t",a[i]);
			tong+=a[i];
		}
	}
	printf("\ntong cac so hoan hao tim duoc la:%d",tong);
}
