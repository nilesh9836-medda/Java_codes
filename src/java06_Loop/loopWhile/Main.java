package java06_Loop.loopWhile;

public class Main {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer();
        char c;
        System.out.println("Enter a string: ");
        try {
            while ( (c = (char)System.in.read()) != '\n'){
                str.append(c);
            }
        }
        catch (Exception e) {
            System.out.println("Error!!! Invalid Input");
        }
        System.out.println("You have entered...");
        System.out.println(str);
    }
}
