#include<stdio.h>

void main()
{
	int c,i;	
	char arr[100];
	char rev[100];

	for( i=0; (c = getchar()) != EOF; i++)
	{
		arr[i] = c;
	}
	int x=0;
	i=sizeof(arr);
	
	while(i>0)
	{
		rev[x]=arr[i-1];
		x++;
		i--;
	}
	
	printf("%s",rev);
	
	

}
