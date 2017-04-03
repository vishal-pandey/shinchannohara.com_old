#include<stdio.h>

void main()
{
	int c;
		
	while((c = getchar()) != EOF)
	{
		if(c == ' ')
		printf("\n");
		else if( c == '\t')
		printf("\n");
		else
		putchar(c);
	}
}
