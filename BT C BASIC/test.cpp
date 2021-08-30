#include<stdio.h>
#include<conio.h>
#include<math.h>
int main(){
	int n;
	printf ("nhap :n");
	scanf ("%d",&n);
	int a[100];

	if(n<1 || n>100){
		printf ("khong hop le");
		printf ("\n xin nhap lai");
		scanf ("%d",&n);
	}
	
	printf ("nhap lai mang ");
	for(int i=0;i<n;i++){
		printf("%d",a[i]);
		scanf("a[%d]",a[i]);
	}
	printf ("hien mang nguoc");
	for(int i=n-1;i>=0;i--){
	printf("%d",a[i]);
	}
}
