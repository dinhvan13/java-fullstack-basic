#include <conio.h>
#include <stdio.h>
#include <math.h>
int main()
{
	int arr[] = {-1,2,3,-4,-5,-6};
	int n = 6;
	int tong = 0;
    for(int i = 0;i < n; i++)
    {  
	    
    	if(arr[i] >= 0)
    	{
    		tong += arr[i];
		}
	}
	printf("tong cac phan tu o vi tri le trong mang la:\t%d",tong);

	_getch();
}
