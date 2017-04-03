class Eclass
{
	int variable1;
	int variable2;
	int variable3;
	
	void display()
	{
		System.out.println("This is method to display the content of Eclass");
		System.out.println("variable1 = "+ variable1);
		System.out.println("variable2 = "+ variable2);
		System.out.println("variable3 = "+ variable3);
	}
		
	//constructor
	Eclass()
	{
		System.out.println("This constructor display the no. of variable contained in the class \n");
		System.out.println(" int variable1 \n int variable2 \n int variable3");
	}

	//parameterised constructor
	//also the example of overloded constructor

	Eclass(int a , int b, int c)
	{
		System.out.println("This constructor assign the value of variables of in the class");
		variable1 = a;
		variable2 = b;
		variable3 = c;
	}

}

class Metho
{
		// Method overloading

	void pro()
	{
		System.out.println("Simple method with no parameter");
	
	}
	 
	int pro(int a)
	{
		System.out.println("method pro called with single parameter square of a is returned");
		
		return a*a;
		

	}
	
	int pro(int a , int b)
	{
		System.out.println("Method pro is called with two parameter of interget type Their product is returned");
		return a*b;
	}
	
	int pro(int a , int b, int c)
	{
		System.out.println("Method pro is called with three parameter of interget type Their product is returned");
		return a*b*c;
	}

	String pro(String s)
	{
		System.out.println("Method pro is called with string That string is returned");
		return s;
	}

	char pro(char ch)
	{

		System.out.println("Method pro is called with parameter of character type That character is returned");
		return ch;
	}


}

class MainClass
{
	public static void main(String args[])
	{		
		//creating object
		Eclass object1 = new Eclass();

		object1.variable1 = 10;
		object1.variable2 = 15;
		object1.variable3 = 20;
		
		object1.display();

		
		//creating object with paramaterised constructor
		Eclass object2 = new Eclass(1,2,3);
		object2.display();		


		Eclass object3 = new Eclass(object1.variable1, object1.variable2, object1.variable3);
		object3.display();


		Metho ob1 = new Metho();
		
		ob1.pro();
		System.out.println(ob1.pro(5));
		System.out.println(ob1.pro(3,4));
		System.out.println(ob1.pro(2,3,4));

		String s = "This is a test string";
			
		System.out.println(ob1.pro(s));
		System.out.println(ob1.pro('v'));


		

	}
}