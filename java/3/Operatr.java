class Operatr
{
	public static void main(String args[])
	{
		int a = 10,b = 15,c;


		System.out.println("Addition");
		c = a+b;
		System.out.println("a + b = " + c);
		
		System.out.println("Substraction");
		c = a-b;
		System.out.println("a - b = "+c);

		System.out.println("multiplication");
		c = a*b;
		System.out.println("a * b = " + c);

		System.out.println("Division");
		c = a/b;
		System.out.println("a / b = "+ c);

		System.out.println("Modulus");
		c = a%b;
		System.out.println("a % b = " + c);

		System.out.println("Increment");
		System.out.println("a = "+a);	
		a++;
		System.out.println("After increment (a++) a = " +a);

		System.out.println("Decrement");
		System.out.println("b = "+b);	
		b--;
		System.out.println("After increment (b--) b = " +b);

		System.out.println("Addition assignment");
		System.out.println("a = "+a);	
		a += 10;
		System.out.println("After Addition assignment (a += 10) a = " +a);

		System.out.println("Substraction assignment");
		System.out.println("b = "+b);	
		b -= 10;
		System.out.println("After Substraction assignment (b -= 10) b = " +b);

		System.out.println("Multiplication assignment");
		System.out.println("a = "+a);	
		a *= 10;
		System.out.println("After Multiplication assignment (a *= 10) a = " +a);

		System.out.println("Division assignment");
		System.out.println("b = "+b);	
		b /= 10;
		System.out.println("After Division assignment (b /= 10) b = " +b);
		
		System.out.println("Modulus assignment");
		System.out.println("a = "+a);	
		a %= 10;
		System.out.println("After Modulus assignment (a += 10) a = " +a);




	}
}