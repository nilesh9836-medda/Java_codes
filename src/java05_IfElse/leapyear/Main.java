package java05_IfElse.leapyear;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year to check if it is Leap year or not: ");
        int a = sc.nextInt();

        if (a%100 == 0)
        {
            if (a%400 == 0)
            {
                System.out.println(a + " is a Leap Year");
            }
            else
            {
                System.out.println(a + " is Not a Leap Year");
            }
        }
        else if (a%4 == 0)
        {
            System.out.println(a + " is a Leap Year");
        }
        else
        {
            System.out.println(a + " is Not a Leap Year");
        }
    }
}