#include <conio.h>
#include <stdio.h>
#include <math.h>
int main()
{
	int arr[] = {1,2,3,4,5,6};
	int n = 6;	
    for(int i = n - 1;i >= 0; i--)
    {  
       if(arr[i]%2 == 0 && i%2 != 0)
       {
       	printf("so %d la so chan o vi tri %d la vi tri le cuoi cung cua mang",arr[i],i);
       	break;
	   }
	}
		_getch();
}
