#include<stdio.h>

void main()
{
	float fahr, celsius;
	int lower, upper , step;

	lower = 0;
	upper = 300;
	step = 20;

	fahr = lower;
		printf("    ______________________ \n");
		printf("    |celsius  faharenheit| \n");

	while(celsius <= upper)
	{
		fahr = ((9.0/5.0)*celsius)+32;
		printf("    |%6.0f %12.1f | \n", celsius, fahr);
		celsius = celsius+step;
	}
		printf("    ______________________ \n");

} 
