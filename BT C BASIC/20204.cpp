#include <conio.h>
#include <stdio.h>
#include <math.h>
int main()
{
	int arr[] = {1,2,3,4,5,6,6,5,2,3};
	int n = 10;
	int count = 0, c =0;
	printf("nhap phan tu can kiem tra'");
	scanf("%d",&c);
    for(int i = 0;i < n; i++)
    {  
	  if(arr[i] == c) 
	  {
	  	count++;
	  }   
    
	}
	printf("nphan tu %d xuat hien %d lan ",c,count);
	
}
