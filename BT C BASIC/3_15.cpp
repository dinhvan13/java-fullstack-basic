#include <stdio.h>
#include <conio.h>
#include <math.h>
int main()
{
	int thang;
	printf("Nhap vao mot thang cua nam:\n");
	scanf("%d",&thang);
	switch(thang)
	{
		case 1: case 2: case3:
		      printf("thang %d => quy 1",thang);
		break;
		case 4: case 5: case 6:
		      printf("thang %d => quy 2",thang);
		break;
		case 7: case 8: case 9:
		     printf("thang %d => quy 3",thang);
		break;
		case 10: case 11: case 12:
		    printf("thang %d => quy 4",thang);
		break;
		default:
			printf("khong hop le!");
		break;
		
	}
	
}
