#include <conio.h>
#include <stdio.h>
#include <math.h>
int FiBoNaCi(int n)
{
	if(n == 1 || n == 2)
	{
		return 1;
	}
	else
	{
		return FiBoNaCi(n - 1) + FiBoNaCi(n -2);
	}
}
int main()
{
  int n = 7;
  printf("so fibonacci thu %d la %d",n,FiBoNaCi(n));
}
