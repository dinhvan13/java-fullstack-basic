#include <conio.h>
#include <stdio.h>
#include <math.h>
//ham tim giai thua dung de quy 
int TimGiaiThuaDungDeQuy(int n)
{
  if(n == 1)
  {
  	return 1;
  }
  else
  {
  	return n * TimGiaiThuaDungDeQuy(n - 1);
  }
}
//ham tim giai thua khong dung de quy 
int TimGiaiThua(int n)
{
	int gt =1;
	for(int i = 1;i <= n; i++)
	{
		gt *= i;
	}
	return gt;
}
int main()
{
  int n = 4;
  printf("giai thua dung de quy %d",TimGiaiThuaDungDeQuy(n));
  printf("\ngiai thua khong dung de quy %d",TimGiaiThua(n));
}
