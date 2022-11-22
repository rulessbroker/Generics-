package com.bridgelabz;

public class FindMaximumNumbers {
	
	void getMax(Integer n1, Integer n2, Integer n3) {
		Integer max = n1;
		if (n2.compareTo(max) > 0) {
			max = n2;
		} else if (n3.compareTo(max) > 0) {
			max = n3;
		}
		System.out.println("The maximum value between the three integer is : "+max);
	}
	public static void main(String[] args) {
		FindMaximumNumbers max = new FindMaximumNumbers();
		
		System.out.println("Welcome To Find Maximun Problem Using Generics \n");
		
		max.getMax(23,42,10);
	}
}
