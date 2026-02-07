package java05_IfElse.oddeven;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to chaeck if it is odd or even: ");
        int a = sc.nextInt();

        if (a%2 == 0)
        {
            System.out.println(a + " is an Even number");
        }
        else
        {
            System.out.println(a + " is an Odd number");
        }
    }
}