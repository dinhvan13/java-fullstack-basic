#include <conio.h>
#include <stdio.h>
#include <math.h>
int main()
{
	int a[100];
	int n = 0,count = 0;
	printf("nhap so phan tu cua mang: ");
	scanf("%d",&n);
	while(n < 3)
    {
    	printf("vui long nhap lai!");
    	scanf("%d",&n);
	}
	for(int i = 0; i < n; i++)
	{
		printf("nhap phan tu thu a[%d] ",i);
		scanf("%d",&a[i]);
		
	}
	for(int i = 1;i <n-1;i++)
	{
		if(a[i] == a[i-1] * a[i+1])
		{
		  printf("\nvi tri cua cac phan tu %d %d %d  la %d %d %d ",a[i-1],a[i],a[i+1],i-1,i,i+1);
		  count++;
		}
	}
	if(count == 0)
	{
		printf("-1");
	}
}
