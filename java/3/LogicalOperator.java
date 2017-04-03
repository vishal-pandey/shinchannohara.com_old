class LogicalOperator
{
	public static void main(String args[])
	{
		//Boolean logical operators operates 
		//only on boolean operands to form a
		// resultant boolean value.

		boolean a = true;
		boolean b = false;

		boolean c = a | b;
		boolean d = a & b;
		boolean e = a ^ b;
		boolean f = (!a & b) | (a & !b);
		boolean g = !a;

		System.out.println(" a = " + a);
		System.out.println(" b = " + b);
		System.out.println(" a|b = " + c);
		System.out.println(" a&b = " + d);
		System.out.println(" a^b = " + e);
		System.out.println("!a&b|a&!b = " + f);
		System.out.println(" !a = " + g);

		boolean x = true;
		boolean y = false;

		System.out.println("x = " + x);
		System.out.println("y = " + y);

		x |= y;
		System.out.println("x |= y : x = " + x);

		y &= x;
		System.out.println("y &= x : y = " + y);


		x ^= y;
		System.out.println("x ^= y : x = " + x);

	}
}