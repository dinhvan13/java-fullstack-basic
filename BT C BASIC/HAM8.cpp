#include <conio.h>
#include <stdio.h>
#include <math.h>
void NhapMang(double a[], int n)
{
	for(int i = 0; i < n; i++)
	{
		printf("a[%d = ",i);
		scanf("%lf",&a[i]);
	}
}
void LietKe(double a[], int n)
{
	printf("cac cap thoa man la : \n");
	int dem = 0;
	for(int i = 0; i < n ;i++)
	{
		for(int j = 0;j < n; j++)
		{
			if(a[i] <= a[j])
			{
				printf("(%.1lf,%.1lf)\n",a[i],a[j]);
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
	double a[5], n = 5;
    NhapMang(a,n);
    LietKe(a,n);
    _getch();
}
