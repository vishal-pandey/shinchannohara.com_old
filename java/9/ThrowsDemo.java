/*
throws

If a method is capable of causing an exception that it does not 
handle, it must specify this behavior so that callers of the 
method can guard themselves against that exception. You do
this by including a throws clause in the method’s declaration.
*/

class ThrowsDemo
{
	static void method() throws ArithmeticException
	{
	//	int z = 0;
	//	int d = 42/z;
		throw new ArithmeticException();
	}

	public static void main(String args[])
	{
		try
		{	
			method();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception is : "+ e);
		}
	}
}