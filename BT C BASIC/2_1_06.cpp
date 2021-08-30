#include <stdio.h>
#include <conio.h>
#include <math.h>
int main()
{
	int arr[] = {5,15,20,6,9,1,2};
	int n = sizeof(arr)/sizeof(arr[0]);
	int count3,count5 = 0;
	for(int i = 0; i < n;i++)
	{
       if(arr[i]%3 == 0)
       {
	     count3++;
	   }
	   else if(arr[i]%5 ==0)
	   {
	   	 count5++;
	   }
	   
	}
	//printf("%d %d",count3,count5);
	if(count3 == n)
	{
		printf("fizz");
	}
	else if(count5 == n)
	{
		printf("buzz");
	}
	else
	{
		for(int j = 0; j <n; j++)
		{
			printf("\t%d",arr[j]);
		}
	}
	
}

