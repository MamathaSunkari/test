package com;

public class PalindromOrNot {
	public boolean isPalindrome(String word)
	{
		char[] charArray =word.toCharArray();
		int start = 0;
		int end= word.length()-1;
		while(start>end)
		{
			if(charArray[start] != charArray[end])
			{
				return false;
			}
			start++;
			end--;
		}
		
		return true;
	}
public static void main(String[] args) {
	PalindromOrNot po = new PalindromOrNot();
	if(po.isPalindrome("madam"))
	{
		System.out.println("The string is palindrome");
	}

	else
	{
		System.out.println("The String is not palindrome");
	}
}
}
