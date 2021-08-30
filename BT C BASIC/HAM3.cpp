#include <conio.h>
#include <stdio.h>
#include <math.h>
int SoChinhPhuong(int n)
{
	 //int sqr = sqrt(n);
	 if(n == pow((sqrt(n)),2))
	 {
	 	return 1;
	 }
	 else
	 {
	 	return 0;
	 }
}
int main()
{   
  		int scp = SoChinhPhuong(3);
  		printf("%d",scp);
}
