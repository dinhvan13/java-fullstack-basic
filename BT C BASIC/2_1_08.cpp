#include <stdio.h>
#include <conio.h>
#include <math.h>
int main()
{
	char arr[] = {1,2,3,4,5,6};
	double kq = 0;
	int n = sizeof(arr)/sizeof(arr[0]);
	int count = 0;
	printf("cac phan tu le trong mang la ");
	for(int i = 0; i < n;i++)
	{
       if(arr[i]%2 != 0)
       {
	     printf("\t%d",arr[i]);
       	 count++;
	   }
	   
	}
	kq = (count*1.0/n)*100;
	printf("\n va ti le = %d / %d = %.f %%",count,n,kq);
	
}

