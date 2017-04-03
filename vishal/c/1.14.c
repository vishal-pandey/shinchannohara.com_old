#include<stdio.h>

void main()
{
	int c;
		
	int i ,j, arr[26];

	for(i=0; i<26; i++)
	{
		arr[i]=0;
	}

	while( (c=getchar()) != EOF )	
	{
		if( c == 'a' || c == 'A')
			++arr[0];
		else if( c == 'b' || c == 'B')
			++arr[1];
		else if( c == 'c' || c == 'C')
			++arr[2];
		else if( c == 'd' || c == 'D')
			++arr[3];
		else if( c == 'e' || c == 'E')
			++arr[4];
		else if( c == 'f' || c == 'F')
			++arr[5];
		else if( c == 'g' || c == 'G')
			++arr[6];
		else if( c == 'h' || c == 'H')
			++arr[7];
		else if( c == 'i' || c == 'I')
			++arr[8];
		else if( c == 'j' || c == 'J')
			++arr[9];
		else if( c == 'k' || c == 'K')
			++arr[10];
		else if( c == 'l' || c == 'L')
			++arr[11];
		else if( c == 'm' || c == 'M')
			++arr[12];
		else if( c == 'n' || c == 'N')
			++arr[13];
		else if( c == 'o' || c == 'O')
			++arr[14];
		else if( c == 'p' || c == 'P')
			++arr[15];
		else if( c == 'q' || c == 'Q')
			++arr[16];
		else if( c == 'r' || c == 'R')
			++arr[17];
		else if( c == 's' || c == 'S')
			++arr[18];
		else if( c == 't' || c == 'T')
			++arr[19];
		else if( c == 'u' || c == 'U')
			++arr[20];
		else if( c == 'v' || c == 'V')
			++arr[21];
		else if( c == 'w' || c == 'W')
			++arr[22];
		else if( c == 'x' || c == 'X')
			++arr[23];
		else if( c == 'y' || c == 'Y')
			++arr[24];
		else if( c == 'z' || c == 'Z')
			++arr[25];
	}

	for ( i = 0; i < 26; ++i)
	{
		for ( j = 0; j < arr[i]; ++j)
		{
			printf("|");
		}
		printf("\n");
	}


}
