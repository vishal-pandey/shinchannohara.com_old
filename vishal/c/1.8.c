#include<stdio.h>

void main()
{

	int bl = 0, tb = 0, nl = 0;

	int c;
	
	while( (c = getchar()) != EOF)
	{
		if(c == '\n')
		++nl;
		if(c == '\t')
		++tb;
		if(c == ' ')
		++bl;
	}

	printf("blank  =  %d \n tab  =  %d \n new line  =  %d",bl,tb,nl);

}
