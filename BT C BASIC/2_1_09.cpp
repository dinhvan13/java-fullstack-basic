#include <stdio.h>
#include <conio.h>
#include <math.h>
int main()
{
	int arr[] = {5,15,20,6,9,1,2};
	int n = sizeof(arr)/sizeof(arr[0]);
	int tong = 0;
	printf("cac so chia het cho 3 hoac 5 la:\n");
	for(int i = 0; i < n;i++)
	{
       if(arr[i]%3 == 0 || arr[i]%5 == 0)
       {
	     tong += arr[i];
	     printf("\t%d",arr[i]);
	   }
	   
	   
	}
	printf("\ntong cac so do la %d",tong);	   

}

