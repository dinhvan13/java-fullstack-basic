#include <math.h>
#include <conio.h>
#include <stdio.h>
int main()
{
	int a = 0;
	printf("nhap a:\n");
	scanf("%d",&a);
	//printf("%d",a);
	switch(a)
	{
		case 2:
			printf("thu hai");
			break;
		case 3:
			printf("thu ba");
			break;
		case 4:
			printf("thu tu");
			break;
		case 5:
			printf("thu nam");
			break;
		case 6:
			printf("thu sau");
			break;
		case 7:
			printf("thu bay");
			break;
		case 8:
			printf("chu nhat");
			break;
		default:
			printf("khong phai thu trong tuan");
			break;
	}
	_getch();
}
