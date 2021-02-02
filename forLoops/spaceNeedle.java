package forLoops;

// This code prints a loose replica of the Space Needle. Size of the figure can
// be changed by changing the class constant below.
public class spaceNeedle {

    // Change the number below to change the size of the Space Needle
    public static final int HEIGHT = 3;
    public static void main(String args[]) {

        drawPole();
        drawBase();
        System.out.println();
        drawBottom();
        drawPole();
        drawBody();
        drawBase();
    }

    // Main method for printing characters that make up Space Needle
    public static void drawObject(int times, String character) {
        for(int i = 0; i < times; i++) {
            System.out.print(character);
        }
    }

    // Prints the pole of the Space Needle
    public static void drawPole() {
        for(int x = 1; x <= HEIGHT; x++) {
            drawObject(3 * HEIGHT, " ");
            // for(int i = 0; i < 3 * HEIGHT; i++) {
            //     System.out.print(" ");
            // }
            System.out.print("||");
            System.out.println();
        }
    }

    // Prints the base of the Space Needle
    public static void drawBase() {
        for(int x = 1; x <= HEIGHT; x++) {
            drawObject(3 * HEIGHT - 3 * x, " ");
            // for(int i = 0; i < 3 * HEIGHT - 3 * x; i++) {
            //     System.out.print(" ");
            // }
            System.out.print("__/");
            drawObject(-3 + 3 * x, ":");
            // for(int j = 0; j < -3 + 3 * x; j++) {
            //     System.out.print(":");
            // }
            System.out.print("||");
            drawObject(-3 + 3 * x, ":");
            // for(int j = 0; j < -3 + 3 * x; j++) {
            //     System.out.print(":");
            // }
            System.out.print("\\__");
            System.out.println();
        }
        System.out.print("|");
        drawObject(6 * HEIGHT, "\"");
        // for(int y = 0; y < 6 * HEIGHT; y++) {
        //     System.out.print('"');
        // }
        System.out.print("|");
    }

    // Prints the bottom portion of the head of the Space Needle
    public static void drawBottom() {
        for(int x = 1; x <= HEIGHT; x++) {
            drawObject(-2 + 2 * x, " ");
            // for(int i = 0; i < -2 + 2 * x; i++) {
            //     System.out.print(" ");
            // }
            System.out.print("\\_");

            // (4, 13) and (5, 16), where (HEIGHT, number of "/\"s to print)
            drawObject(((3 * HEIGHT) + 1) - 2 * x, "/\\");
            // for(int j = 0; j < ((3 * HEIGHT) + 1) - 2 * x; j++) {
            //     System.out.print("/\\");
            // }
            System.out.print("_/");
            System.out.println();
        }
    }

    // Prints the body of the Space Needle
    public static void drawBody() {
        for(int x = 1; x <= 4 * HEIGHT; x++) {

            // (4, 9) and (5, 12) where (HEIGHT, number of spaces)
            drawObject((3 * HEIGHT) - 3, " ");
            // for(int i = 0; i < (3 * HEIGHT) - 3; i++) {
            //     System.out.print(" ");
            // }
            System.out.print("|%%||%%|");
            System.out.println();
        }
    }
   
}
