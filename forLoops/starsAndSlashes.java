package forLoops;

public class starsAndSlashes {
    public static void main(String args[]) {
        slashFigure();
        starSlashFigure();
    }

    public static void printObject(int times, String character) {
        for(int i = 0; i < times; i++) {
            System.out.print(character);
        }
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
            printObject(7 - x, "*");

            printObject(x, " ");

            printObject(14 - 2 * x, "/");

            printObject(-2 + 2 * x, "\\");

            printObject(x, " ");

            printObject(7 - x, "*");

            System.out.println();
        }
    }
}
