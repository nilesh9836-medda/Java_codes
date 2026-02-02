package java03_InputOutput.output;

import java.io.PrintStream;

public class Main {
	public static void main (String[] args){
		System.out.print("Hello");
		System.out.print("\n");
		System.out.print("Java");
		System.out.println("Have a");
		System.out.println("Good Coding!");
		double number = Math.PI;
		System.out.printf("number = %0.11f", number);
	}
}
