package forLoops;

public class dollarFigure {
    public static void main(String args[]) {
        for(int x = 1; x <= 6; x++) {
            for(int i = 0; i < 2 * x - 2; i++) {
                System.out.print("*");
            }
            for(int j = 0; j < 8 - x; j++) {
                System.out.print("$");
            }
            System.out.println();
        }
    }
}
