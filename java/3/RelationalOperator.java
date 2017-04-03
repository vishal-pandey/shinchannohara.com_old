class RelationalOperator
{
	public static void main(String args[])
	{
		// Outcome of a relational operator is o boolean value

		int a = 1, b = 1, c = 2, d = 3;
		boolean bo;
		bo = (2>1); 

		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println(bo+"\n");

		System.out.println("a == b  :" + (a==b));
		System.out.println("a == c  :" + (a==c));
		System.out.println("a != c  :" + (a!=c));
		System.out.println("c > a   :" + (c>a ));
		System.out.println("a < c   :" + (a<c ));
		System.out.println("c >= a  :" + (c>=a));
		System.out.println("b >= a  :" + (b>=a));
		System.out.println("a <= c  :" + (a<=c));
		System.out.println("a <= b  :" + (a<=b));

	}
}