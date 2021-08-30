#include <stdio.h>
#include <conio.h>
#include <math.h>
int main()
{
	int arr[] = {5,15,20,6,9,1,2};
	int n = sizeof(arr)/sizeof(arr[0]);
	int tong = 0;
	printf("so dau tien trong mang la boi cua 10 la :\n");
	for(int i = 0; i < n;i++)
	{
       if(arr[i]%10 == 0)
       {
	     printf("\t%d\n va o vi tri thu %d",arr[i],i);
	     break;
	   }
	   
	}


}

