#include<stdio.h>

void main()
{

	int c;
		
	while( (c = getchar()) != EOF)
	{
		if(c == ' ' || c == '\t')
		printf("\n");
		else
		printf("|");
	}
		
printf("\n\n\n");

	
}
