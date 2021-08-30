#include <conio.h>
#include <stdio.h>
#include <math.h>
int main()
{
   int a = 0,b = 0,c = 0;
   printf("nhap so a :\n");
   scanf("%d",&a);
   printf("nhap so b :\n");
   scanf("%d",&b);
   printf("nhap so c :\n");
   scanf("%d",&c);
   if(a*b*c == a+b+c)
   {
   		printf("%d,%d,%d la so tam hoa",a,b,c);
   }
   else
   {
   		printf("3 so nhap vao khong phai la so tam hoa");
   }
   _getch();
   
 	
 } 
