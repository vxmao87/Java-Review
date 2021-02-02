public class ForLoops {
    public static void main(String args[]) {
        slashFigure();
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
}
