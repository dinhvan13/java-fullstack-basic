#include <conio.h>
#include <stdio.h>
#include <math.h>
int main()
{
	
	int a = 20;
	printf("nhap vao mot so co 2 chu so :");
	scanf("%d",&a);
	int b = a/10;
	int c = a%10;
    if(b == 1)  printf("muoi\t");
    else if(b == 2) printf("hai muoi\t");
	else if(b == 3) printf("ba muoi\t");
	else if(b == 4) printf("bon muoi\t");
	else if(b == 5) printf("nam muoi\t");
	else if(b == 6) printf("sau muoi\t");
	else if(b == 7) printf("bay muoi\t");
	else if(b == 8) printf("tam muoi\t");
	else if(b == 9) printf("chin muoi");
	
	if(c == 1) printf("mot");
	else if(c == 2) printf("hai");
	else if(c == 3) printf("ba");
	else if(c == 4) printf("bon");
	else if(c == 5) printf("nam");
	else if(c == 6) printf("sau");
	else if(c == 7) printf("bay");
	else if(c == 8) printf("tam");
	else if(c == 9) printf("chin");
	
	
	
	_getch();
}
