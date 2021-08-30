#include <conio.h>
#include <stdio.h>
#include <math.h>
int main()
{
	
	int x = 1000,y=2000,z=5000;
	int tong = 0;
    int count = 0;
	for(int i = 0;i<=200;i++)
	  {
	    
	  	for(int j = 0; j<=100;j++)
	  	{
	  		
	  		for(int k = 0;k<=40;k++ )
	  		{
	  		  	
			  tong = i*x +j*y+k*z;
			  if(tong == 200000)
			  {
			  	count ++;
				printf("i\tj\tk\t %d %d %d \n\n",i,j,k);
			    printf("so ket qua phu hop la %d\t",count);
			   
			
			  }
			  
			  
			 
			 
			}
			
			
		  }
		  
	  }
	  
	_getch();
}
