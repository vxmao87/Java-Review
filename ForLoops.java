public class ForLoops {
    public static void main(String args[]) {
        slashFigure();
        starSlashFigure();
    }

    public static void slashFigure() {
        for(int x = 1; x <= 6; x++) {
            for(int i = 0; i < 2 * x - 2; i++) {
                System.out.print("\\");
            }
            for(int j = 0; j < 26 - 4 * x; j++) {
                System.out.print("!");
            }
            for(int k = 0; k < 2 * x - 2; k++) {
                System.out.print("/");
            }
            System.out.println();
        }
    }

    public static void starSlashFigure() {
        for(int x = 1; x <= 7; x++) {
            for(int i = 0; i < 7 - x; i++) {
                System.out.print("*");
            }
            for(int j = 0; j < x; j++) {
                System.out.print(" ");
            }
            for(int k = 0; k < 14 - 2 * x; k++) {
                System.out.print("/");
            }
            for(int m = 0; m < -2 + 2 * x; m++) {
                System.out.print("\\");
            }
            for(int n = 0; n < x; n++) {
                System.out.print(" ");
            }
            for(int p = 0; p < 7 - x; p++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
