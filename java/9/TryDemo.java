/*
Once an exception is thrown, program control transfers out of 
the try block into the catch block.

Once the catch statement has executed, program control continues 
with the next line in the program following the entire try/catch
mechanism.

The scope of the catch clause is restricted to those statements 
specified by the immediately preceding try statement.

The statements that are protected by try must be surrounded by 
curly braces. (That is, they must be within a block.) You cannot 
use try on a single statement.

The goal of most well-constructed catch clauses should be to resolve 
the exceptional condition and then continue on as if the error had 
never happened.

You can display this description in a println( ) statement by simply
assing the exception as an argument.

*/

class TryDemo
{
	public static void main(String args[])
	{	
		int a,d;		

		try
		{
			System.out.println("This is inside try block");
			System.out.println("In This block an arithmetic exception i.e, division by zero occurs");
			
			d=0;
			a = 42/d;
			System.out.println("This is after exception has occured This line would not be printed");
		}
		catch(ArithmeticException e)
		{
			System.out.println("This is inside catch block");
			System.out.println("Description By user :Division by zero");
			System.out.println("Description by compiler : "+ e);
		}

		System.out.println("This is after catch statement");
	}
}
