package com;

public class MissingNumber {
	public int findmissingNumber(int[] arr)
	{
		int n = arr.length +1;
		int sum = n*(n+1)/2;
		for(int num: arr)
		{
			sum = sum-num;
		}
		return sum;
		
	}
	public void arrayDemo()
	{
		int[] arr = {1,3,6,8,2,4,7};
		System.out.println(findmissingNumber(arr));
	}
public static void main(String[] args) {
	MissingNumber mn = new MissingNumber();
	mn.arrayDemo();
}
}
