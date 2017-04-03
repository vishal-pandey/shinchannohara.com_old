#include<stdio.h>


int convert( int fah)
{

int cel = (5.0/9.0) * (fah-32.0);
return cel;
}


void main()
{
	float fahr, celsius;
	int lower, upper , step;

	lower = 0;
	upper = 300;
	step = 20;

	fahr = lower;
		printf("    ______________________ \n");
		printf("    |Faharenheit  celsius| \n");

	while(fahr <= upper)
	{
		celsius = convert(fahr);
		printf("    |%6.0f %12.1f | \n", fahr, celsius);
		fahr = fahr+step;
	}
		printf("    ______________________ \n");

} 
