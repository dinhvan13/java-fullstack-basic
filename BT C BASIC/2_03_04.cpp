#include <conio.h>
#include <stdio.h>
#include <math.h>
int main()
{
	int a[] = {1,4,6,7,4,9,81};
	int n = 7,count = 0;
	printf("cac so chinh phuong la ");
	for(int i = 1; i < n; i++)
	{
		if(a[i] == pow(sqrt(a[i]),2))
		{
			printf("%d ",a[i]);
			count++;
		}
	}
	if(count == 0)
	{
		printf("-1");
	}
	
}
