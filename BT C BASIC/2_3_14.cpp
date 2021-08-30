#include <conio.h>
#include <stdio.h>
#include <math.h>
int main()
{
	int a[100],b[50];
	int n = 0,m = 0,dem = 0;
	//nhap mang a
	printf("nhap so phan tu cua mang a ");
	scanf("%d",&n);
	for(int i = 0; i < n; i++)
	{
		printf("nhap phan tu thu a[%d] ",i);
		scanf("%d",&a[i]);
	}
	for(int i = 0; i < n; i++)
	{
		printf("\n%d",a[i]);
	}
	
	//nhap mang b
	printf("\nnhap so phan tu cua mang b ");
	scanf("%d",&m);
	for(int j = 0; j < m; j++)
	{
		printf("nhap phan tu thu b[%d] ",j);
		scanf("%d",&b[j]);
	}
	for(int j = 0; j < m; j++)
	{
		printf("\n%d",b[j]);
	}
	
	for(int i = 0; i < n; i++)
	{
		int count = 0;
		for(int j = 0; j < m; j++)
		{
			if(a[i] == b[j])
			{
				count++;
			}
		}
		if(count == 0)
		{
			dem++;
		}
    
	}
	for(int i = 0; i < m; i++)
	{
		int count = 0;
		for(int j = 0; j < n; j++)
		{
			if(b[i] == a[j])
			{
				count++;
			}
		}
		if(count == 0)
		{
			dem++;
		}
	}
	printf("\nso phan tu chi xuat hien o mot trong hai mang la %d",dem);
}
