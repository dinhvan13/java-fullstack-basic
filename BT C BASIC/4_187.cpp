#include <stdio.h>
#include <conio.h>
#include <math.h>
int main()
{
	int a = 0,b = 0;
	printf("nhap so a: \n");
	scanf("%d",&a);
	printf("nhap so b\n");
	scanf("%d",&b);
	printf("cac boi so cua 5 trong khoang %d - %d la",a,b);
	for(int i = a;i < b;i++)
	{
		if(i%5 == 0)
		{
			printf("\t%d",i);
		}
		
		
	}
	printf("\ncac so nguyen to trong khoang %d - %d la\t",a,b); 
	
	for(int i = a;i <= b;i++)
	{   
	   
	    int count = 0;
	    for(int j = 1;j <= i;j++)
	    {
		    
	    	if(i % j == 0)
	    	{
	    		count++;
			}
		}
		if(count == 2)
		{
			printf("%d\t",i);
		}
		
	}
	
	//tim so nguyen to cung nhau cua hai so a va b
	int na = a, nb = b;
	int ucln;
	while(na != nb)
	{
		if(na > nb)
		{
			na -= nb;
		}
		else
		{
			nb -= na;
		}
	}
	ucln = na;
	if(ucln == 1)
	{
		printf("\n%d va %d la so nguyen to cung nhau \n",a,b);
	}
	else
	{
		printf("\n%d va %d khong la so nguyen to cung nhau \n",a,b);
	}
	
	
	//kiem tra hai so co phai la so ban be hay khong
	
	int tongUa = 0, tongUb = 0;
	
    for(int i = 1; i <= a; i++)
    {
    	if(a %i == 0)
    	{
    		tongUa += i;
		}
		
	}
	
		
    for(int j = 1; j <= b; j++)
    {
    	if(a %j == 0)
    	{
    		tongUb += j;
		}
		
	}
	if(tongUa == b || tongUb == a)
	{
		printf("yes");
	}
	else
	{
		printf("no");
	}
	
	
		
	//printf("khong co so nao chia het cho 5");
		
	_getch();
}
