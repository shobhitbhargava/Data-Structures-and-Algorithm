package com.dsa.math;

public class CountDigits {

	public static int countDigits(int number) {
		int result = 0;
		
		while(number > 0) {
			number = number / 10;
			result++;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(countDigits(32321));
	}

}
