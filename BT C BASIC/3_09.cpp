#include <conio.h>
#include <stdio.h>
#include <math.h>
int main()
{
	int a = 0, b = 0;
	printf("nhap so a:\n");
	scanf("%d",&a);
	printf("nhap so b:\n");
	scanf("%d",&b);
	char c;
	printf("nhap dau phep tinh:\n");
	scanf(" %c",&c);
	switch(c)
	{
		case '+':
			printf("tong cua 2 so %d va %d la:%d",a,b,a+b);
			break;
		case '-':
			printf("hieu cua 2 so %d va %d la:%d",a,b,a-b);
			break;
		case '*':
			printf("tich cua 2 so %d va va %d la:%d",a,b,a*b);
			break;
		case '/':
			printf("thuong cua 2 so %d va va %d la:%lf",a,b,a*1.0/b);
			break;
		default:
			printf("phep tinh khong thuc hien duoc");
		break;
			
	}
	_getch();
}
