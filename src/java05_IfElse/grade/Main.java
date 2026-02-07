package java05_IfElse.grade;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks to see grade: ");
        int a = sc.nextInt();

        if (a==100)
        {
            System.out.println("Your Grade : O");
        }
        else if (a<100 && a>=90)
        {
            System.out.println("Your Grade : E");
        }
        else if (a<90 && a>=80)
        {
            System.out.println("Your Grade : A");
        }
        else if (a<80 && a>=70)
        {
            System.out.println("Your Grade : B");
        }
        else if (a<70 && a>=60)
        {
            System.out.println("Your Grade : C");
        }
        else if (a<60 && a>=50)
        {
            System.out.println("Your Grade : D");
        }
        else
        {
            System.out.println("Your Grade : F");
        }
    }
}