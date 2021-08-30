#include <conio.h>
#include <stdio.h>
#include <math.h>
int main()
{
	float diemToan = -500, diemVan = 50,diemAnh = 6,diemTB = 0;
	diemTB = (diemToan + diemVan + diemAnh) / 3;
	if(diemTB >= 0 && diemTB < 5)
	{
		printf("diem trung binh ba mon la : %lf va xep loai trung binh",diemTB);
	}
	else if(diemTB >= 5 && diemTB < 6)
	{
		printf("diem trung binh ba mon la : %lf va xep loai trung binh kha",diemTB);
	}
	else if(diemTB >= 6 && diemTB <7.5)
	{
		printf("diem trung binh ba mon la : %lf va xep loai kha",diemTB);
	}
	else if(diemTB >= 7.5 && diemTB < 9)
	{
		printf("diem trung binh ba mon la : %lf va xep loai kha",diemTB);
	}
	else if(diemTB >= 9 && diemTB <=10)
	{
		printf("diem trung binh ba mon la : %lf va xep loai gioi",diemTB);
	}
	else 
	{
		printf("khong xep loai hoc luc duoc!");
	}
	_getch();
}
