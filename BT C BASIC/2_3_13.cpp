#include <conio.h>
#include <stdio.h>
#include <math.h>
int main()
{
	int a[] = {2,3,5,6,15,16};
	int n = 6, tong = 0, count = 0;
	double tbc = 0;
	for(int i = 0;i<n;i++)
	{
		if(a[i] == pow(2,i))
		{
			count++;
			tong+=a[i];
			printf("%d",a[i]);
		}
		
	}
	//printf("%d",count);
	if(count > 0)
	{
	  tbc = tong/(count*1.0);
	  printf("trung binh cong cua cac so do la %.2lf ",tbc);
	}
	else
	{
		printf("khong tinh duoc");
	}

	
}
