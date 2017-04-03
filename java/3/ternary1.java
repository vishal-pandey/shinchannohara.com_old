class ternary1
{
	static String tr()
	{
		System.out.println("condition is true");
		return "true";
	}

	static String fl()
	{
		System.out.println("contition is false");
		return "false";
	}			
	
	public static void main(String[] args)
	{
		String s;
		System.out.println("Ternary operator");
		System.out.println("(condition) ? execute this if condition is true : else execute this");
	
		s = 	(2>3) ? tr() : fl() ;

		System.out.println(s);	
	}
}

		