#include <conio.h>
#include <stdio.h>
#include <math.h>
int main()
{
	int a[] = {1,2,3,4,5,6};
	int n = 6;
	int tong = 0,count = 0;
	double tbc = 0 ;
	for(int i = 0;i < n;i++)
	{   
	   
	   if(a[i]%2 == 0 && i%2 != 0)
	   {
		  tong+=a[i];
		  count++;
	   }

	}
	tbc = tong/(count*1.0);
    printf("tong cac so chan o vi tri le trong mang la %lf",tbc);
}
