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

    // Main method for printing characters that make up Space Needle
    public static void drawObject(int times, String character) {
        for(int i = 0; i < times; i++) {
            System.out.print(character);
        }
    }

    // Prints the top point of the rocket
    public static void drawTop() {
        for(int x = 1; x <= SIZE + 2; x++) {
            drawObject(2 * SIZE - x, " ");

            drawObject(x, "/");

            System.out.print("**");
            drawObject(x, "\\");

            System.out.println();
        }
    }

    // Prints line separating rocket parts
    public static void drawLine() {
        System.out.print("+");
        drawObject(2 * SIZE, "=*");

        System.out.print("+");
        System.out.println();
    }

    // Prints top half of body
    public static void drawTopBody() {
        for(int x = 1; x <= SIZE; x++) {
            System.out.print("|");
            drawObject(SIZE - x, ".");

            drawObject(x, "/\\");

            drawObject(2 * SIZE - 2 * x, ".");

            drawObject(x, "/\\");

            drawObject(SIZE - x, ".");

            System.out.print("|");
            System.out.println();
        }
    }

    // Prints bottom half of body
    public static void drawBottomBody() {
        for(int x = 1; x <= SIZE; x++) {
            System.out.print("|");
            drawObject(x - 1, ".");

            drawObject(-x + SIZE + 1, "\\/");

            drawObject(x * 2 - 2, ".");

            drawObject(-x + SIZE + 1, "\\/");

            drawObject(x - 1, ".");

            System.out.print("|");
            System.out.println();
        }
    }
}
