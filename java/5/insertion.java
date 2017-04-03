class insertion
{
	public static void main(String args[])
	{
		int arr[] = {3,5,3,6,8,6,9};
		int t;
		
		for(int i = 1; i<arr.length; i++)
		{
			int d = i;
			while(d>0 & arr[d]<arr[d-1])
			{
				t = arr[d];
				arr[d] = arr[d-1];
				arr[d-1] = t;
				d--;
			}
		}
		for(int x : arr)
		System.out.print(x+"       ");
	}
}