package com;

public class SecondMaximum {
	public int FindSecondMaximum(int[] arr)
	{
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		for(int i =0; i<arr.length; i++)
		{
			if(arr[i]>max)
			{
				secondMax = max;
				max = arr[i];
			}else if(arr[i]>secondMax && arr[i]!=max)
			{
				secondMax=arr[i];
			}
		}
		return secondMax;
	}
public static void main(String[] args) {
	int[] num = {13, 34,2,24,33,1};
	SecondMaximum sm = new SecondMaximum();
	System.out.println(sm.FindSecondMaximum(num));
}
}
