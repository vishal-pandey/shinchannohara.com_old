class ifDemo
{	
	public static void main(String[] args)
	{
		System.out.println("\t\t simple if statement");
		
		boolean condition = true,condition1 = false,condition2 = true,condition3 = false;

		if (condition == true)
		System.out.println("Simple if staement is executed");


		System.out.println("\t\t if else statement");		
		if (condition == true)
		System.out.println("Condition is true if block is executed");	
		else
		System.out.println("Condition is not true else block is executed ");


		System.out.println("\t\t Nested if statement");
		if(cond ition1 == true)
		{
			if(condition2 == false)
			System.out.println("condition1 is true condition2 is false");
			else
			System.out.println("Both the conditions are true");
		}
		else
		System.out.println("Condition1 is false");


		System.out.println("\t\t if else if laddar");
		if(condition1 == true)
		System.out.println("Condition 1 is true");
		else if(condition2 == true)
		System.out.println("condition 2 is true");
		else if (condition3 == true)
		System.out.println("condition3 is true");
		else
		System.out.println("non of the condition is true");
	}
}
		