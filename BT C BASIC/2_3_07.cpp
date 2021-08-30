#include <conio.h>
#include <stdio.h>
#include <math.h>
int main()
{
	int a[100];
	int n = 0;
    printf("nhap so phan tu cua mang la ");
    scanf("%d",&n);
    for(int i = 0;i<n;i++)
    {
    	printf("\nnhap phan tu thu a[%d] ",i);
    	scanf("%d",&a[i]);
	}
	printf("cac phan tu cua mang la ");
	for(int i = 0;i < n;i++)
	{
		printf("%d ",a[i]);
	}
    //tim cac phan tu le cua mang
    printf("\ncac phan tu le cua mang la ");
	for(int i = 0;i < n;i++)
	{
		if(a[i]%2 != 0)
        {
        	printf("%d ",a[i]);
		}
	}
	//tim cac cac so nguyen to le trong mang 
	printf("\ncac so nguyen to trong mang la ");
	for(int i = 0; i< n;i++)
	{
		int count = 0;
		for(int j = 1; j <= a[i];j++)
		{
			if(a[i]%j == 0 )
			{
				count++;
			}
		}
		if(count == 2 && a[i]%2 != 0)
		{
			printf("%d ",a[i]);
			
		}
	
	}
	
	//
	printf("\ncac so nguyen to trong mang la ");
	int tich = 1;
	for(int i = 0; i< n;i++)
	{
		int count = 0;
		for(int j = 1; j <= a[i];j++)
		{
			if(a[i]%j == 0 )
			{
				count++;
			}
		}
		if(count == 2 && i%2 == 0)
		{
			printf("%d ",a[i]);
			tich*=a[i];
			
		}
	
	}
	printf("\ntich cac so nguyen to o vi tri chan la %d",tich);
	

}
