package com;

public class ArrayDemo {

	public static void main(String[] args) {
		int[] array = new int[5];
		array[0] = 5;
		array[1] = 1;
		array[2] = 8;
		array[3] = 2;
		array[4] = 10;
		System.out.println(array.length);
		
		for(int i = 0; i<array.length; i++)
		{
			System.out.println(array[i]);
		}
		

	}

}
