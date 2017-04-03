/*

finally

finally creates a block of code that will be executed after a 
try/catch block has completed and before the code following 
the try/catch block.

The finally block will execute whether or not an exception is 
thrown. If an exception is thrown, the finally block will
execute even if no catch statement matches the exception.

The finally clause is optional. However, each try statement 
requires at least one catch or a finally clause.

*/

class FinallyDemo
{
	public static void main(String args[])
	{
		try
		{
			System.out.println("Inside try block No exception is thrown");
			System.out.println("Even Though finally block will executed");
		}
		//No catch statement is defined as 
		finally
		{
			System.out.println("Inside finally block");
			System.out.println("finally block executed when no execption is thrown");
		}
		
		try
		{
			System.out.println("Inside try block which throws a ArrayOutOfBoundsException ");

			throw new ArrayIndexOutOfBoundsException("This is message");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Inside catch block which catch " + e + "thrown by try");
			System.out.println("Finally Block would be executed even when catch statement catches the execption");	
		}
		finally
		{
			System.out.println("Finally block is executed when catch statement matched");
		}


		try
		{
			System.out.println("Inside try block which throws a ArrayOutOfBoundsException ");
			System.out.println("Finally Block would be executed even when no appropriate catch statement matches execption");	
			throw new ArrayIndexOutOfBoundsException("This is message");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Inside catch block which catch " + e + "thrown by try");
			
		}
		finally
		{
			System.out.println("Finally block is executed when NO catch statement matched");
		}

		
				
	}
}