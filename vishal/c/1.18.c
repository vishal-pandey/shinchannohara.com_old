#include<stdio.h>

void main()
{
	int c,i;
	char arr[100];

	for(i=0; (c = getchar()) != EOF; i++)
	{
		if(c == '\n' )
		{
			--i;
			while(i>0)
			{
				if(arr[i-1] == ' ')
				i--;
			}
		}
	
		else
		arr[i] = putchar(c);
	}
}
