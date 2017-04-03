package A;

public class PackageDemo
{
	protected int method1(int n)
	{
		if(n == 1) return 1;
		return method1(n-1)*n;
	}
	
	void method2(int n)
	{
		
		int arr[] = new int[n];
		
		arr[0] = 1;
		arr[1] = 1;

		for(int i = 2 ; i < n; i++)
		arr[i] = arr[i-1] + arr[i-2];

		for(int i = 0; i < n ; i++)
		{
			System.out.print(" "+ arr[i]);
		}
	}
	
	void method3()
	{
		int n=30;
		int arr[]=new int[100];
		arr[0] = -1;
		arr[1] = -1;
		
		for(int i = 2; i<=n; i++)
		{
			int x = 2;

			while(x!=(i))
			{
				if( i%x == 0 )
				{
					
					arr[i]=-1;
					
					break;
				}
				x++;
			}
		}
		
		for(int i=0; i<=n; i++)
		{
			if(arr[i]==0)
			arr[i]=i;
		}


		System.out.println("First 10 prime no. is");
		for (int i=0; i<=n; i++)
		{
			if(arr[i] != -1)
			System.out.println(arr[i]);
		}
			

		int sum=0;
		for(int i=0; i<=n; i++)
		{	
			if(arr[i] != -1)
			sum += arr[i];
		}		
		System.out.println("Sum of first 10 prime no. is "+sum);
		

	}
}