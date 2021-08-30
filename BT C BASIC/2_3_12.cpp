#include <conio.h>
#include <stdio.h>
#include <math.h>
int main()
{
	int a[] = {2,3,40,40,6,7,8,1};
	int n = -1;
	int socp = 0;
		for(int i = 0; i < n; i++)
		{
			if(a[i] == pow(sqrt(a[i]),2))
			{
			    //socp = a[i];
				printf("so chinh phuong dau tien trong mang la %d va nam o vi tri thu %d",a[i],i);
				socp++;
				break;
			}
			
		}
		if(socp == 0)
		   {
			printf("khong tim thay so chinh phuong trong mang");
		   }
		
	}

