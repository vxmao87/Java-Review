package forLoops;

public class dollarFigure {
    public static final int SIZE = 9;
    public static void main(String args[]) {
        for(int x = 1; x <= SIZE; x++) {
            for(int i = 0; i < 2 * x - 2; i++) {
                System.out.print("*");
            }
            for(int j = 0; j < SIZE + 1 - x; j++) {
                System.out.print("$");
            }
            for(int k = 0; k < (SIZE * 2 + 2) - 2 * x; k++) {
                System.out.print("*");
            }
            for(int j = 0; j < SIZE + 1 - x; j++) {
                System.out.print("$");
            }
            for(int i = 0; i < 2 * x - 2; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
