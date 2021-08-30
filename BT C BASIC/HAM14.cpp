#include <conio.h>
#include <stdio.h>
#include <math.h>
void NhapMang(int a[], int n)
{
	for(int i = 0; i < n; i++)
	{
		printf("a[%d] = ",i);
		scanf("%d",&a[i]);
	}
}
void LietKeCapChan(int a[], int n)
{
	printf("cac cap thoa man la : \n");
	int dem = 0;
	for(int i = 1; i <=n ;i++)
	{
		if(a[i] %2 == 0)
		{
			if(a[i-1] %2 == 0)
			{
				printf("(%d,%d)\n",a[i],a[i-1]);
				dem++;
			}
			if(a[i+1] %2 == 0)
			{
				printf("(%d,%d)\n",a[i],a[i+1]);
				dem++;
			}
		}
		
	}
	if(dem == 0)
	{
		printf("khong co cap gia tri nao thoa man");
	}

}
int main()
{
	int a[10], n = 10;
    NhapMang(a,n);
    LietKeCapChan(a,n);
    _getch();
}
