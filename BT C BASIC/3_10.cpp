#include <conio.h>
#include <stdio.h>
#include <math.h>
int main()
{
	char c = 'a';
	if(c >= 'a' && c <= 'z' || c>= 'A' && c <= 'Z')
	{
      if(c >= 'a' && c <= 'z'){
      	printf("%c la ky tu thuong\n",c);
      	if(c == 'a' || c == 'o' || c == 'u' || c == 'e' || c == 'i')
      	{
      		printf("%c la nguyen am\n",c);
		  }
		else
		{ 
		    printf("%c la phu am\n",c);
		}
		
	  }
	  else if(c >= 'A' && c <= 'Z')
	  {
	  	printf ("%c la ky tu hoa\n",c);
	  	if(c == 'A' || c == 'O' || c == 'U' || c == 'E' || c == 'I')
      	{
      		printf("%c la nguyen am\n",c);
		  }
		  else
		{ 
		    printf("%c la phu am\n",c);
		}
	  }
	  
	
	}
	else
	{
		printf("day khong phai la chu cai!");
	}
	
	
	_getch();
}
