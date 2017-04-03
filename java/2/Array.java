class Array
{
	public static void main(String args[])
	{	
		int arr1[];
		arr1 = new int[10];

		int arr2[] = new int[10];

		for (int i =0; i<10; i++)
		{
			arr1[i] = i+1;
			arr2[i] = i+1;
		}

		int arr3[] = {1,2,3,4,5,6,7,8,9,10};

		for(int i=0; i<10; i++)
		{
	
			System.out.println("arr1["+i+"] = " + arr1[i]);
			System.out.println("arr2["+i+"] = " + arr2[i]);
			System.out.println("arr3["+i+"] = " + arr3[i]);
			System.out.println();
		}
	}
}  