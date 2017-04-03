class class1
{
	int a ,b,c;
}
class class2
{
	double a,b,c;
}

class test
{
	public static void main(String args[])
	{
		try
		{
			class1 ob1 = new class1();
			class1 ob2 = new class1();
			class1 ob3 = new class1();
			class2 ob4 = new class2();
	
			class1 arr[] = new class1[5];
			ob1 s[] = new int[5];
			arr[0] = ob1;
		//	arr[1] = ob4;
		}
		catch(ArrayStoreException e)
		{
			System.out.println("Exception is :" + e);
		}	
	
	}
}

