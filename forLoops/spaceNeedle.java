package forLoops;

public class spaceNeedle {
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
        for(int x = 1; x <= 4; x++) {
            for(int i = 0; i < 12; i++) {
                System.out.print(" ");
            }
            System.out.print("||");
            for(int i = 0; i < 12; i++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void drawBase() {
        for(int x = 1; x <= 4; x++) {
            for(int i = 0; i < 12 - 3 * x; i++) {
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
        for(int y = 0; y < 24; y++) {
            System.out.print('"');
        }
        System.out.print("|");
    }

    public static void drawBottom() {
        for(int x = 1; x <= 4; x++) {
            for(int i = 0; i < -2 + 2 * x; i++) {
                System.out.print(" ");
            }
            System.out.print("\\_");
            for(int j = 0; j < 13 - 2 * x; j++) {
                System.out.print("/\\");
            }
            System.out.print("_/");
            System.out.println();
        }
    }

    public static void drawBody() {
        for(int x = 1; x <= 16; x++) {
            for(int i = 0; i < 9; i++) {
                System.out.print(" ");
            }
            System.out.print("|%%||%%|");
            System.out.println();
        }
    }
   
}
