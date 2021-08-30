#include <conio.h>
#include <stdio.h>
#include <math.h>
int main()
{
	int arr[] = {6,2,5,1,4,3};
	int n = 4;
	printf("mang sau khi sap sep tang dan la:");
	for(int i = 0; i< n - 1;i++)
	{
		for(int j = i+1; j < n;j++)
		{
			int temp;
			if(arr[i] < arr[j])
			{
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
			
	}
	for(int k = 0;k < n - 1;k++)
	{
		printf("\t%d",arr[k]);
	}

	
}
