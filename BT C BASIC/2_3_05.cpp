#include <conio.h>
#include <stdio.h>
#include <math.h>
int main()
{
    int n = 0,a[n];
	printf("nhap so phan tu cua mang ");
	scanf("%d",&n);
	for(int i = 1;i <= n;i++)
	{
		printf("nhap phan tu thu %d ",i);
		scanf("%d",&a[i]);
    }
    printf("mang ban dau:");
    for(int i = 0;i<n;i++)
    {
    	printf("%d ",a[i]);
	}
	printf("\nmang dao nguoc la:");
	for(int j = n -1;j >= 0;j--)
	{
		printf("%d ",a[j]);
	}
}
