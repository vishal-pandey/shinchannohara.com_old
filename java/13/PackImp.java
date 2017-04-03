import A.*;

class PackImp extends A.PackageDemo
{
	public static void main(String args[])
	{	
		A.PackageDemo ob = new A.PackageDemo();
		System.out.println("The factorial of 5 is "+ ob.method1(5)+"\n\n\n");
		System.out.println("The Fibonacci series of upto 10 nos. is");
		ob.method2(10);
		System.out.println("\n\n\n");
		ob.method3();
	}
}