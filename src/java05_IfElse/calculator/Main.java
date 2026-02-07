package java05_IfElse.calculator;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();

        char choice;
        System.out.println("Choose ->");
        System.out.println("+ : Addition");
        System.out.println("- : Subtraction");
        System.out.println("* : Multiplication");
        System.out.println("/ : Division");
        System.out.print("Your Choice --> ");
        System.out.flush();

        try
        {
            switch(choice = (char) System.in.read())
            {
                case '+': System.out.println("Result=" + (a+b));
                    break;
                case '-': System.out.println("Result=" + (a-b));
                    break;
                case '*': System.out.println("Result=" + (a*b));
                    break;
                case '/': System.out.println("Result=" + (float)a/b);
                    break;
                default : System.out.println("Invalid Choice (IC)");
            }
        }
        catch(Exception e)
        {
            System.out.println("I/O Error!!!");
        }
    }
}