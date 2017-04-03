#include<stdio.h>

void main()
{
	long int N , i , j ,T=0;
	
	scanf("%ld",&N);


	long int C[N] , I[N];


	for(i=0; i<N ; i++)
	scanf("%ld",&C[i]);

	for(i=0; i<N ; i++)
	scanf("%ld",&I[i]);

		
		



	while(N>0)
	{

		if(C[0]==I[0])
		{
			T++;
			for(i=1; i<N; i++)
			{
				C[i-1]=C[i];
				I[i-1]=I[i];
			}
			N--;
		}	

		else
		{
			int temp;
			temp = C[0];

			for(i=1; i<N; i++)
			C[i-1]=C[i];
				
			C[N-1]=temp;
			T++;
		}


	}
	printf("%ld",T);			

}
