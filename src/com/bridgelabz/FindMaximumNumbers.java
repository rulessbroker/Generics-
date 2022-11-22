package com.bridgelabz;

public class FindMaximumNumbers {

	public Integer getMaxWithInteger(Integer n1, Integer n2, Integer n3) {
		Integer max = n1;
		if (n2.compareTo(max) > 0) {
			max = n2;
		} else if (n3.compareTo(max) > 0) {
			max = n3;
		}
		System.out.println("The maximum value between the three Integer values is : " + max);
		return max;
	}

	public Float getMaxWithFloat(Float n1, Float n2, Float n3) {
		Float max = n1;
		if (n2.compareTo(max) > 0) {
			max = n2;
		} else if (n3.compareTo(max) > 0) {
			max = n3;
		}
		System.out.println("The maximum value between the three Float values is : " + max);
		return max;
	}

	public String getMaxWithString(String n1, String n2, String n3) {
		String max = n1;
		if (n2.compareTo(max) > 0) {
			max = n2;
		} else if (n3.compareTo(max) > 0) {
			max = n3;
		}
		System.out.println("The maximum value between the three Float values is : " + max);
		return " ";
	}

	public static void main(String[] args) {
		FindMaximumNumbers max = new FindMaximumNumbers();

		System.out.println("Welcome To Find Maximun Problem Using Generics \n");

		max.getMaxWithInteger(23, 42, 10);

		max.getMaxWithFloat(10.12f, 11.34f, 9.8f);

		max.getMaxWithString("Banana", "Apple", "Peach");
	}
}
