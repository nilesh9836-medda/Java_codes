package java04_operators.relational;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Relational Operators: <,>,==,!=");
        System.out.println("(a==b) is : " + (a==b));
        System.out.println("(a>b) is : " + (a>b));
        System.out.println("(a<b) is : " + (a<b));
        System.out.println("(a!=b) is : " + (a!=b));
    }
}