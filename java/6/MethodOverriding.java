class SuperClass
{
	int a;
	int b;

	SuperClass(int x, int y)
	{
		a=x;
		b=y;
	}




	void method()
	{

		System.out.println("int a = "+ a);
		System.out.println("int b = "+ b);
		System.out.println();
	}
}

class SubClass1 extends SuperClass
{
	int c;
	void method()
	{

		super.method();
		//System.out.println("int a = "+ a);
		//System.out.println("int b = "+ b);
		System.out.println("int c = "+ c);
		System.out.println();

	}

	SubClass1(int x, int y, int z)
	{
		super(x,y);
		c=z;
		
	}

}


class SubClass2 extends SuperClass
{
	int c,d;
	void method()
	{

		super.method();
		//System.out.println("int a = "+ a);
		//System.out.println("int b = "+ b);
		System.out.println("int c = "+ c);
		System.out.println("int d = "+ d);
		System.out.println();

	}

	SubClass2(int x, int y, int z, int v)
	{
		super(x,y);
		c=z;
		d=v;
	}

}

class MethodOverriding
{
	public static void main(String args[])
	{
		
		SuperClass ob = new SuperClass(1,2);
		SubClass1 ob1 = new SubClass1(3,4,5);
		SubClass2 ob2 = new SubClass2(6,7,8,9);
		SuperClass r;

		ob.method();
		ob1.method();
		ob2.method();
		
		r= ob;
		r.method();

		r= ob1;
		r.method();

		r= ob2;
		r.method();
		
		
	}
}	






