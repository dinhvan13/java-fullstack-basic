#include <conio.h>
#include <stdio.h>
#include <math.h>
int main()
{
	int a[] = {123,341,445,442,446,744};
	int n = 6;
	for(int i = 0; i < n; i++)
	{
       int count = 0;
       int dem = 0;
       int temp = a[i];
       while(temp > 0)
       {
       
		   if((temp % 10)%2 == 0 )
       	{
       		count++;
		}

		dem++;
		temp/=10;
	   }
	   if(dem == count)
	   {
	   	printf("%d ",a[i]);
	   }
       
	}
	
}
