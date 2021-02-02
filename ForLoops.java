public class ForLoops {
    public static void main(String args[]) {
        slashFigure();
    }

    public static void slashFigure() {
        for(int x = 0; x < 6; x++) {
            for(int i = -2; i <= 10; i += 2) {
                System.out.print("\n");
            }
            for(int j = 22; j >= 2; j -=4) {
                System.out.print("!");
            }
            for(int k = -2; k <= 10; k += 2) {
                System.out.print("/");
            }
            System.out.println();
        }
    }
}
