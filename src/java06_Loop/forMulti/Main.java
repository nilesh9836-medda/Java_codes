package src.java06_Loop.forMulti;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.println("You have asked for "+rows+" rows...");
        System.out.println("You pattern is generated...");
        for (int a=0; a<=1000; ++a);
        for (int i=1; i<=rows; ++i) {
            for (int j=1,k=1; j<=i && k<=i; ++j,++k) {
                System.out.print(k+"* ");
            }
            System.out.println();
        }
    }
}
