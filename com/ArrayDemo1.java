package com;
// How to Print elements of an array in java
public class ArrayDemo1 {
    public void printArray(int[] arr)
    {
    	int n = arr.length;
    	for(int i =0; i< n; i++)
    	{
    		System.out.println(arr[i]);
    	}
    	System.out.println();
    }
	public static void main(String[] args) {
	 ArrayDemo1 array = new ArrayDemo1();
	 array.printArray(new int[] {5, 2, 4,3,8});

	}

}
