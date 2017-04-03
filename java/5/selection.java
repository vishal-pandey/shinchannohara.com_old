class selection
{
	public static void main(String[] args)
	{
		int arr[] = {7,3,6,8,3,7,5,0,99,-555};
		int temp;	
	

		for (int j=0; j<arr.length; j++)
		{
		
			int min = j;

			for (int i=j+1 ; i<arr.length; i++)
			{
			
				if(arr[min]>arr[i])				
				min = i;
			}
		
			temp = arr[j];
			arr[j] = arr[min];
			arr[min] = temp;
		}
			
		for(int x : arr)
		System.out.println(x);
			
	}
} 