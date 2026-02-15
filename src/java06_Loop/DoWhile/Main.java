package java06_Loop.DoWhile;

public class Main {
    public static void main(String[] args) {
        int row,column,y;
        System.out.println("Multiplication Table ");
        row = 1;
        do {
            column = 1;
            do {
                y = row * column;
                System.out.print(y+"\t");
                column+=1;
            }while(column<=3);
            System.out.println();
            row+=1;
        }while(row<=4);
    }
}