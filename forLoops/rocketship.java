package forLoops;

public class rocketship {
    public static final int SIZE = 6;
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

    // Main method for printing characters that make up Space Needle
    public static void drawObject(int times, String character) {
        for(int i = 0; i < times; i++) {
            System.out.print(character);
        }
    }

    public static void drawTop() {
        for(int x = 1; x <= SIZE + 2; x++) {
            drawObject(2 * SIZE - x, " ");
            // for(int i = 0; i < 2 * SIZE - x; i++) {
            //     System.out.print(" ");
            // }
            drawObject(x, "/");
            // for(int j = 0; j < x; j++) {
            //     System.out.print("/");
            // }
            System.out.print("**");
            drawObject(x, "\\");
            // for(int k = 0; k < x; k++) {
            //     System.out.print("\\");
            // }
            System.out.println();
        }
    }

    public static void drawLine() {
        System.out.print("+");
        drawObject(2 * SIZE, "=*");
        // for(int i = 0; i < 2 * SIZE; i++) {
        //     System.out.print("=*");
        // }
        System.out.print("+");
        System.out.println();
    }

    public static void drawTopBody() {
        for(int x = 1; x <= SIZE; x++) {
            System.out.print("|");
            drawObject(SIZE - x, ".");
            // for(int i = 0; i < SIZE - x; i++) {
            //     System.out.print(".");
            // }
            drawObject(x, "/\\");
            // for(int j = 0; j < x; j++) {
            //     System.out.print("/\\");
            // }
            drawObject(2 * SIZE - 2 * x, ".");
            // for(int k = 0; k < 2 * SIZE - 2 * x; k++) {
            //     System.out.print(".");
            // }
            drawObject(x, "/\\");
            // for(int a = 0; a < x; a++) {
            //     System.out.print("/\\");
            // }
            drawObject(SIZE - x, ".");
            // for(int b = 0; b < SIZE - x; b++) {
            //     System.out.print(".");
            // }
            System.out.print("|");
            System.out.println();
        }
    }

    public static void drawBottomBody() {
        for(int x = 1; x <= SIZE; x++) {
            System.out.print("|");
            drawObject(x - 1, ".");
            // for(int i = 0; i < x - 1; i++) {
            //     System.out.print(".");
            // }
            drawObject(-x + SIZE + 1, "\\/");
            // for(int j = 0; j < -x + SIZE + 1; j++) {
            //     System.out.print("\\/");
            // }
            drawObject(x * 2 - 2, ".");
            // for(int k = 0; k < x * 2 - 2; k++) {
            //     System.out.print(".");
            // }
            drawObject(-x + SIZE + 1, "\\/");
            // for(int a = 0; a < -x + SIZE + 1; a++) {
            //     System.out.print("\\/");
            // }
            drawObject(x - 1, ".");
            // for(int b = 0; b < x - 1; b++) {
            //     System.out.print(".");
            // }
            System.out.print("|");
            System.out.println();
        }
    }
}
