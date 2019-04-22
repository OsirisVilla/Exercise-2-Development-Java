package gitPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class Hello {

	private String name;
	private int age;

	private int first;
	private int last;

	private String myString;

	Hello() {

	}

	// Constructor
	Hello(String name) {

		this.name = name;

	}

	// Overloaded constructor
	Hello(String name, int age) {

		this.name = name;
		this.age = age;
	}

	// Method that print a sequence of numbers
	public void printNumbers(int num) {
		for (int i = 0; i <= num; i++) {
			System.out.print(i + " ");
		}
		System.out.println("");
	}

	// Overloaded method
	public void printNumbers(int first, int last) {
		this.first = first;
		this.last = last;

		for (int i = this.first; i <= this.last; i++) {
			System.out.print(i + " ");

		}
		System.out.println("");
	}

	// Getter for myString
	public String getMyString() {
		return myString;
	}

	// Setter for myString
	public void setMyString(String myString) {
		this.myString = myString;
	}

	// Print separated list of 20 numbers between odds and even
	public void oddAndEven() {

		ArrayList<Integer> arrL = new ArrayList<Integer>();

		arrL.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20));

		System.out.print("Odd numbers: ");

		for (int i : arrL) {

			if (i % 2 != 0) {

				System.out.print(i + " ");

			}

		}

		System.out.println(" ");

		System.out.print("Even numbers: ");
		for (int j : arrL) {

			if (j % 2 == 0) {

				System.out.print(j + " ");

			}

		}
		System.out.println(" ");
	}

	// Print numbers in specific pattern - from 0 to 20
	public void builder() {

		StringBuilder sb = new StringBuilder();

		int j = 10;
		int k = 1;

		for (int i = 0; i <= 20; i++) {

			if (i > 9) {
				k = 2;
			}

			if (i < 11) {

				sb.replace(i, i + k, String.valueOf(i));
				System.out.println(sb);
				sb.insert(i, " ");

			} else if (i >= 10) {

				sb.replace(j, i + k, String.valueOf(i));
				j--;
				sb.deleteCharAt(j);
				System.out.println(sb);
			}
		}

	}

	public static void main(String[] args) {

		Hello firstConstructor = new Hello("Osiris");
		System.out.println("My name is " + firstConstructor.name);

		Hello secondConstructor = new Hello("Osiris", 28);
		System.out.println("My name is " + secondConstructor.name + " and I'm " + secondConstructor.age + " years old");

		Hello print2 = new Hello();
		print2.printNumbers(5);

		Hello print = new Hello();
		print.printNumbers(0, 10);

		Hello list = new Hello();
		list.oddAndEven();

		Hello printSb = new Hello();
		printSb.builder();

	}

}
