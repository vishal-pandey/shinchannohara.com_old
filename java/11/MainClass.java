interface A
{
	void variables();
	int area();
}

interface B extends A
{
	void display();
}

class InterfaceDemo implements B
{
	int length = 34;
	int breadth = 56;

	public void variables()
	{
		System.out.println("length = "+length);
		System.out.println("breadth = "+breadth);
	}
	
	public int area()
	{
		return length*breadth;
	}

	public void display()
	{
		System.out.println("Area of rectangle is"+area());
	}
}

class MainClass
{
	public static void main(String args[])
	{

		InterfaceDemo ob1 = new InterfaceDemo();

		ob1.variables();
		ob1.display();

	}
}	