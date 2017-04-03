#include<stdio.h>

int getlinee(char line[]);


void main()
{
	int len;
	int max;


	char line[10000];
	

	max = 80;
	
	while((len = getlinee(line)) > 0)
		if(len > max)
		{
			printf("%s", line);

			
		}
	
		
}

int getlinee(char s[])
{
	int c,i;

	for( i=0;  (c = getchar()) != EOF && c !='\n' ; i++)
		s[i] =  c;
	if (c == '\n')
	{
		s[i] = c;
		++i;
	}
	s[i] = '\0';
	return i;
}


