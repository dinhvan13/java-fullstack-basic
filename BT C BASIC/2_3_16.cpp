#include <conio.h>
#include <stdio.h>
#include <math.h>
int main()
{
	int a[50];
	int n = 0, check = 0;
	while(n < 1 || n > 50 )
	{
		printf("khong hop le");
		printf("\nvui long nhap so phan tu cua mang ");
		scanf("%d",&n);
	}
	//int count = 0;
	for(int i = 0; i < n; i++)
	{
		printf("nhap so phan tu cua mang a[%d] ",i);
		scanf("%d",&a[i]);
		if((a[i] + a[i+1])%2 == 0)
		{
			check++;
		}
	}
	if(check == 0)
	{
		printf("no");
	}
	else
	{
		printf("yes");
	}

}
