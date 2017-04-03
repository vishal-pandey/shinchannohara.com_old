class loopDemo
{
	public static void main(String[] args)
	{
		int n =10;	
		boolean condition =true;
		
		System.out.println("while loop \n");
		
		while(condition)
		{
			System.out.println("condition is true while loop block is executing");
			n--;
			if(n==0)
			condition = false;
			
		}
		
		System.out.println("Now the condition is false while loop is exited");

		condition = true;
		System.out.println("for loop");
		
		for(int i = 0;condition; i++)
		{
			if(i==10)
			condition = false;
			
			System.out.println("i is : "+ i + "   less then 10. so condition is true and block of for loop is executing " );
		}
		System.out.println("Now i is : " + 10 + "and condition become false and exited for loop ");


		condition = true;
		System.out.println("do-while loop");
		
		do
		{
			System.out.println("Inside do block of do-while statement");
			System.out.println("condition is yet to be checked n :"+ n);
			System.out.println("Condition is false when n = 10 \n\n");			


			if (n == 10)
			condition = false;
			n++;		

		}
		while(condition);			

		System.out.println("outside do while loop n = " + n);
		System.out.println("Do block was executed once when condition had become false i.e, when n=10");


		System.out.println("\t\t for each statement \n\n");
		int num[] = new int[10];

		for(int i = 0; i<10; i++)
		num[i] = i;
		
		
		for(int x : num)
		System.out.println("value is : "+x);


		System.out.println("for each loop for 2D array");

		int nums[][] = new int[5][5];

		for(int i =0; i<5; i++)
			for(int j = 0; j<5 ; j++)
			nums[i][j] = (i+j);

		for(int y[] : nums)
			{
			for(int z : y)
			System.out.print("   "+ z);
			System.out.println();		
			}
				








	}
}