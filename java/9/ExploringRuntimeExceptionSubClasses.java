//Java’s Unchecked RuntimeException Subclasses Defined in java.lang

class ExploringRuntimeExceptionSubClasses
{

		enum test
		{	one, two, three, four, five	}

		static int squ(int a)
		{
			return a*a;
		}

		
	public static void main(String args[])
	{
		
		
		try
		{
			int a = 42/args.length;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception is : " + e);
		}

		try
		{
			String arr[]= {"First String"};
			arr[8] = "Trying to assign the 9th string ";	
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception is : " + e);
		}


/*
		try
		{
		 	int arr[] = {1,2,3,4,5,6,7,8};
			arr[3] = 'c';

		}
		catch(ArrayStoreException e)
		{
			System.out.println("Exception is : " + e);
		}


		try
		{
	
	

		}
		catch(Exception e)
		{		
			System.out.println("Exception is : " + e);
		}


*/

/*
		try
		{
			int a = 25;
			String = "Shinchan nohara";
			a = (String ) s;
	

		}
		catch(Exception e)
		{		
			System.out.println("Exception is : " + e);
		}
*/

/*		try
		{
			
			
			test a[] = test.values();
			for (test x : a)
			System.out.println(x);
			
	
			test t;
			t = test.one;
			System.out.println("value of t is :"+t);
			System.out.println(test.six);
	

		}
		catch(EnumConstantNotPresentException e)
		{		
			System.out.println("Exception is : " + e);
		}

*/
/*
		try
		{
	
			int sq = squ("sdf");

		}
		catch(IllegalArgumentException e)
		{		
			System.out.println("Exception is : " + e);
		}

*/


		try
		{
		 	int arr[] = new int[10];
			for(int i=0; i<10; i++)
			{
				if(i==4)
				arr[i] = "vishal";
				else
				arr[i] = i;
			}		

		}
		catch(ArrayStoreException e)
		{
			System.out.println("Exception is : " + e);
		}


	}
}