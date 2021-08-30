#include <conio.h>
#include <stdio.h>
#include <math.h>
bool KiemTraKyTu(char kt)
{
	return kt >= '0' && kt <= '9';
}
int GhepSo(int so, char k)
{
    return so * 10 + k - '0';
}
int DemKyTu(char a[])
{
    int dem = 0;
    for(int i = 0; a[i] != '\0';i++)
    {
	   dem++;
	}
	return dem;
}
int TongChuoi(char a[])
{
  int tong = 0,so = 0,n = DemKyTu(a);
  for(int i = 0; i <= n; i++)
  {
    if(KiemTraKyTu(a[i]) == true)
    {
    	so =  GhepSo(so,a[i]);
	}
	else
	{
		tong += so;
		so = 0;
	}
  }
  return tong;
}

int main()
{
  char a[] =   {"234  5af1 vb4asdd1 "};
  printf("%d\n",DemKyTu(a));
  printf("%d",TongChuoi(a));
}
