class bubble
{
	public static void main(String[] args)
	{
		int arr[] = {5,3,6,8,4,2,5,7,2,6,8,3,1,0,7,5,3,2,4};
		int temp;		





		for(int j =0; j<arr.length; j++ )
		for(int i =0; i<arr.length - j - 1; i++)
		{	if(arr[i]>arr[i+1])
			{
	
				temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
			
		for(int x : arr)
		System.out.println(x+ "    ");






		
	}
}		