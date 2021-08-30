#include <conio.h>
#include <stdio.h>
#include <math.h>
int main()
{
	int arr[] = {1,3,4,6,7,7};
	int n = 6;
	//int kq=0;
	printf("cac phan tu o vi tri chan la :");
	for(int i = 0;i<n;i++)
	{
		
		if(i % 2 == 0)
		{
			printf("%d",arr[i]) ;
		}
		
	}
	printf("\ncac phan tu o vi tri le la :");
	for(int j = 0;j<n;j++)
	{
		if(j%2 != 0)
		{
			printf("%d",arr[j]);
		}
	}
	
	_getch();
}
