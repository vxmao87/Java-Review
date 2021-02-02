package forLoops;

public class spaceNeedle {
    public static final int HEIGHT = 7;
    public static void main(String args[]) {

        drawPole();
        drawBase();
        System.out.println();
        drawBottom();
        drawPole();
        drawBody();
        drawBase();
    }

    public static void drawPole() {
        for(int x = 1; x <= HEIGHT; x++) {
            for(int i = 0; i < 3 * HEIGHT; i++) {
                System.out.print(" ");
            }
            System.out.print("||");
            System.out.println();
        }
    }

    public static void drawBase() {
        for(int x = 1; x <= HEIGHT; x++) {
            for(int i = 0; i < 3 * HEIGHT - 3 * x; i++) {
                System.out.print(" ");
            }
            System.out.print("__/");
            for(int j = 0; j < -3 + 3 * x; j++) {
                System.out.print(":");
            }
            System.out.print("||");
            for(int j = 0; j < -3 + 3 * x; j++) {
                System.out.print(":");
            }
            System.out.print("\\__");
            System.out.println();
        }
        System.out.print("|");
        for(int y = 0; y < 6 * HEIGHT; y++) {
            System.out.print('"');
        }
        System.out.print("|");
    }

    public static void drawBottom() {
        for(int x = 1; x <= HEIGHT; x++) {
            for(int i = 0; i < -2 + 2 * x; i++) {
                System.out.print(" ");
            }
            System.out.print("\\_");

            // (4, 13) and (5, 16), where (HEIGHT, number of "/\"s to print)
            for(int j = 0; j < ((3 * HEIGHT) + 1) - 2 * x; j++) {
                System.out.print("/\\");
            }
            System.out.print("_/");
            System.out.println();
        }
    }

    public static void drawBody() {
        for(int x = 1; x <= 4 * HEIGHT; x++) {

            // (4, 9) and (5, 12) where (HEIGHT, number of spaces)
            for(int i = 0; i < /*9*/ (3 * HEIGHT) - 3; i++) {
                System.out.print(" ");
            }
            System.out.print("|%%||%%|");
            System.out.println();
        }
    }
   
}
