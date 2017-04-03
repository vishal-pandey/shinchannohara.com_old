class Wrap
{
	public static void main(String args[])
	{
		Integer iOb = new Integer(100);
		int i = iOb.intValue();

		System.out.println(i + "    " + iOb);

		Character c = new Character('c');
		System.out.println(c.charValue());

		Boolean b = new Boolean(true);
		Boolean bs = new Boolean("TrUe");
		System.out.println(bs.booleanValue());
		System.out.println(b.booleanValue());

		Byte by = new Byte("10");
		System.out.println(by.byteValue());

		Float f = new Float(125);		
		System.out.println(f.floatValue());
		
		Double d = new Double(125.22);
		System.out.println(d.doubleValue());

		Long l = new Long(12454);
		System.out.println(l.longValue());

		Short s = new Short("75");
		System.out.println(s.shortValue());
		



	}
}