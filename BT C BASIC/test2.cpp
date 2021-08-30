#include<stdio.h>
#include<conio.h>
#include<math.h>
int main(){
	int n;
	printf ("nhap :n\t");
	scanf ("%d",&n);
	int a[100];

while(n<1 || n>100){
	{
		printf ("khong hop le");
		printf ("\n xin nhap lai");
		scanf ("%d",&n);
		break;
	}
}
	
	for(int i = 0; i< n; i++){
		printf("\n Nhap so phan tu a[%d] = ",i);
		scanf("%d",&a[i]);

	}
	
	 printf("\nmang vua nhap la:");
	 for(int i = 0; i< n; i++)
	 {
	 			printf("\t%d",a[i]);
	 }
    
	printf ("\nhien mang nguoc");
	for(int i=n-1;i>=0;i--){
	  printf("\t%d",a[i]);
	}
}
