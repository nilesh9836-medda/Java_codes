package java02_DataTypes.constants;

public class Main {
    public static void main(String[] args) {
        // A normal variable (can change)
        int x = 100;
        System.out.println("x = " + x);
        x = 50; 
        System.out.println("x updated to: " + x);

        // A constant (cannot change)
        final int LIMIT = 90; 
        System.out.println("Constant LIMIT = " + LIMIT);
        
        // LIMIT = 80; // This would cause a compile error!
    }
}
