package com.bridgelabz;

public class FindMaximumNumbers<T extends Comparable<T>> {

	void getMax(T n1, T n2, T n3) {
		T max = n1;
		if (n2.compareTo(max) > 0)
			max = n2;
		if (n3.compareTo(max) > 0)
			max = n3;
		System.out.println(max);
	}

	public static void main(String[] args) {

		FindMaximumNumbers max = new FindMaximumNumbers();

		System.out.println("Welcome To Find Maximun Problem Using Generics \n");

		System.out.println("The maximum value between the three integer - ");
		max.getMax(23, 10, 42);

		System.out.println("\nThe maximum value between the three Float - ");
		max.getMax(10.12f, 11.34f, 9.8f);

		System.out.println("\nThe maximum value between the three String - ");
		max.getMax("Banana", "Apple", "Peach");
	}
}
