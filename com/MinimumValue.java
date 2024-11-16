package com;

public class MinimumValue {
	public int findMinimum(int[] arr)
{
	if(arr==null || arr.length==0)
	{
		throw new IllegalArgumentException("Invalid input");
	}
	
		int min = arr[0];
		for(int i =1; i<arr.length; i++)
		{
			if(arr[i]<min)
			{
				min = arr[i];
			}
		}
		return min;
		
}
//	public static void printArray(int[] arr)
//	{
//		for(int i =0; i<arr.length; i++)
//		{
//			System.out.println(arr[i]);
//		}
//		System.out.println();
//	}
	public static void main(String[] args) {
	  int[] numbers = {5, 9, 3,15,1,1};
	  MinimumValue mv = new MinimumValue();
	 System.out.println(mv.findMinimum(numbers)); 
	}

}
