package forLoops;

public class rocketship {
    public static final int SIZE = 3;
    public static void main(String args[]) {
        drawTop();
        drawLine();
        drawTopBody();
        drawBottomBody();
        drawLine();
        drawBottomBody();
        drawTopBody();
        drawLine();
        drawTop();
    }

    public static void drawTop() {
        for(int x = 1; x <= 5; x++) {
            for(int i = 0; i < 6 - x; i++) {
                System.out.print(" ");
            }
            for(int j = 0; j < x; j++) {
                System.out.print("/");
            }
            System.out.print("**");
            for(int k = 0; k < x; k++) {
                System.out.print("\\");
            }
            System.out.println();
        }
    }

    public static void drawLine() {
        System.out.print("+");
        for(int i = 0; i < 6; i++) {
            System.out.print("=*");
        }
        System.out.print("+");
        System.out.println();
    }

    public static void drawTopBody() {
        for(int x = 1; x <= 3; x++) {
            System.out.print("|");
            for(int i = 0; i < 3 - x; i++) {
                System.out.print(".");
            }
            for(int j = 0; j < x; j++) {
                System.out.print("/\\");
            }
            for(int k = 0; k < 6 - 2 * x; k++) {
                System.out.print(".");
            }
            for(int a = 0; a < x; a++) {
                System.out.print("/\\");
            }
            for(int b = 0; b < 3 - x; b++) {
                System.out.print(".");
            }
            System.out.print("|");
            System.out.println();
        }
    }

    public static void drawBottomBody() {
        for(int x = 1; x <= 3; x++) {
            System.out.print("|");
            for(int i = 0; i < x - 1; i++) {
                System.out.print(".");
            }
            for(int j = 0; j < -x + 4; j++) {
                System.out.print("\\/");
            }
            for(int k = 0; k < x * 2 - 2; k++) {
                System.out.print(".");
            }
            for(int a = 0; a < -x + 4; a++) {
                System.out.print("\\/");
            }
            for(int b = 0; b < x - 1; b++) {
                System.out.print(".");
            }
            System.out.print("|");
            System.out.println();
        }
    }
}
