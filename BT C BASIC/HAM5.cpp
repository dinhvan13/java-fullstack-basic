#include <conio.h>
#include <stdio.h>
#include <math.h>
int GiaiThua(int a)
{
  int tich = 1;
  for(int i = 2; i <= a; i++)
  {
  	 tich*=i;
  }
  return tich;
  	
}
float TongGiaiThua(int n)
{
	double tong = 0;
	for(int i = 1; i <= n;i++)
	{
		tong += 1.0/GiaiThua(i);
	}
	return tong;
}
int main()
{   

    printf("tong cac giai thua la %.2lf ",TongGiaiThua(3));	
}
