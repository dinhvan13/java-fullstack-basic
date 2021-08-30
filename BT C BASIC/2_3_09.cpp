#include <conio.h>
#include <stdio.h>
#include <math.h>
int main()
{
	int a[100],n = 0;
	while(n < 1 || n > 100)
	{
		printf("vui long nhap lai so phan tu cua mang\n");
		printf("nhap so phan tu cua mang ");
		scanf("%d",&n);
	}
	for(int i = 0; i < n; i++)
	{
		printf("nhap phan tu thu a[%d] ",i);
		scanf("%d",&a[i]);
	}
	printf("mang ban dau la ");
	for(int i = 0; i < n; i++)
	{
		printf("%d ",a[i]);
	}
	printf("\nmang nguoc tao thanh la ");
	for(int i = n -1  ; i >=  0 ; i--)
	{
		printf("%d ",a[i]);
	}
}
