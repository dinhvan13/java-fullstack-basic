#include <conio.h>
#include <stdio.h>
#include <math.h>
int main()
{
	int a[] = {1,3,5,4,1};
	int n = 5, count = 0;
	for(int i = 0; i < n/2;i++)
	{
		if(a[i] != a[n-1-i])
		{
			count++;
			break;
		}
	}
	if(count != 0)
	{
		printf("mang khong doi xung");
	}
	else
	{
		printf("mang doi xung");
	}
	
}
