class Ternary
{
	public static void main ( String args[])
	{
		int i = 10;
		int j = i<0 ? -i : i;
		System.out.println(j);

		i = -10;
		j = i<0 ? -i : i;
		System.out.println(j);
	}
}