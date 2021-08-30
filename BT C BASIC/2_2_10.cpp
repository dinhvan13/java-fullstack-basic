#include <conio.h>
#include <stdio.h>
#include <math.h>
int main()
{
	int a[] = {123,341,445,442,446,744};
	int n = 6;
	int max1 = a[0], max2 = a[1];
	
	for(int i = 0; i < n; i++)
	{
      if(max1 < a[i])
      {
      	max1 = a[i];
	  }
	}
	
		for(int j = 0;j < n; j++)
	{
		
		if(max2 < a[j] && a[j] != max1)
		{
			max2 = a[j];
		}
	   
	}
	printf("%d %d",max1,max2);	
}
