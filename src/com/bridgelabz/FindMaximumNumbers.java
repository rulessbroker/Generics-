package com.bridgelabz;

public class FindMaximumNumbers<T extends Comparable<T>> {
	private T n1;
	private T n2;
	private T n3;

	public FindMaximumNumbers(T n1, T n2, T n3) {
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;

		T max = n1;
		if (n2.compareTo(max) > 0)
			max = n2;
		if (n3.compareTo(max) > 0)
			max = n3;
		System.out.println(max);
	}

	public static void main(String[] args) {

		System.out.println("Welcome To Find Maximun Problem Using Generics \n");

		System.out.println("The maximum value between the three integer - ");
		FindMaximumNumbers integerMax = new FindMaximumNumbers(23, 10, 42);

		System.out.println("\nThe maximum value between the three Float - ");
		FindMaximumNumbers floatMax = new FindMaximumNumbers(10.12f, 11.34f, 9.8f);

		System.out.println("\nThe maximum value between the three String - ");
		FindMaximumNumbers stringMax = new FindMaximumNumbers("Banana", "Apple", "Peach");
	}
}
