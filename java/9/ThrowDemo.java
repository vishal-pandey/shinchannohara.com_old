/*

Throw

it is possible for your program to throw an exception explicitly, 
using the throw statement.

The flow of execution stops immediately after the throw statement;

The nearest enclosing try block is inspected to see if it has a
catch statement that matches the type of exception. If it does 
find a match, control is transferred to that statement. If not, 
then the next enclosing try statement is inspected, and so on. 
If no matching catch is found, then the default exception handler 
halts the program and prints the stack trace.

*/

class ThrowDemo
{
	public static void main(String args[])
	{
		try
		{
			System.out.println("Exception thrown with empty constructor");
			throw new ArithmeticException();
			//System.out.println("Execution has stopped this would not be printed");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception thrown is : "+e);
		}

	
		try
		{
			System.out.println("Exception thrown with String parameterised constructor");
			throw new ArithmeticException("Demo");
			//System.out.println("Execution has stopped this would not be printed");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception thrown is : "+e);
		}
	


	}
}