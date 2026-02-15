package src.java06_Loop.forEach;

public class Main {
    public static void main(String[] args) {
        int number[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100}; // Initialization of Array
        for (int i:number) {
            if (i>=40 && i<=80)
                System.out.print(i+"\t");
        }
    }
}
