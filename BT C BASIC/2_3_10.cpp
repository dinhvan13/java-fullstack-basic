#include <conio.h>
#include <stdio.h>
#include <math.h>
int main()
{
	int n = 0, count = 0;
	int a[100];
	int m = 0;
	printf("nhap so phan tu cua mang ");
	scanf("%d",&n);
	while(n < 1 || n > 100)
	{
		printf("khong hop le!");
		printf("\nvui long nhap lai so phan tu cua mang ");
		scanf("%d",&n);
	}

		
		for(int i = 0; i < n; i++)
		{
			printf("nhap phan tu thu %d",i);
			scanf("%d",&a[i]);
			
		}
		

	printf("nhap so nguyen can kiem tra ");
	scanf("%d",&m);
	for(int i = 0;i < n; i++)
	{
		if(a[i] == m)
	    {
		printf("%d",i);
		count++;
		break;
	    }
	if(count == 0)
	{
		printf("-1");
	}
	
	}
	
}
