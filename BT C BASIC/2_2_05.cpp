#include <stdio.h>
#include <conio.h>
int main()
{
	char arr[] = "Dua tay day nao, mai ben nhau ban nho";
	int n = sizeof(arr)/sizeof(arr[0]);
	int count = 0;
	for(int i = 0; i < n;i++)
	{
		if(arr[i] == 'n')
		{
			count++;
		}
	}
	printf("ky tu n xuat hien %d lan ",count);
	

    
	
}

