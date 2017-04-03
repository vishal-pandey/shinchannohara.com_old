#include<stdio.h>
//#define MAXLINE 1000

//int getlinee(char line[], int maxline);
int getlinee(char line[]);
void copy (char to[], char from[]);

void main()
{
	int len;
	int max;
//	char line[MAXLINE];
//	char longest[MAXLINE];
	char line[10000];
	char longest[10000];

	max = 0;
	
	while((len = getlinee(line)) > 0)
		if(len > max)
		{
			max = len;
			copy(longest, line);
		}
	if(max > 0)
		printf("%s", longest);
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


void copy( char to[], char from[])
{
	int i;

	i=0;
	
	while((to[i] = from[i]) != '\0')
	++i;
}
