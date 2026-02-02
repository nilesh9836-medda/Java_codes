package java03_InputOutput.input.BufferedReader;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try {
			String input = br.readLine();
			int n = Integer.parseInt(input);
			System.out.println("Square is = " + n*n);
		}
		catch(Exception ioe) {
			System.out.println("input error : " + ioe);
		}
		//br.close();
	}
}
