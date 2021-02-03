package parameters;

public class random {
    public static void main(String args[]) {
        printNumbers(15);
        System.out.println();
        printPowersOf2(10);
        System.out.println();
        printPowersOfN(-2, 8);
        System.out.println();
        printSquare(3, 7);
        printSquare(7, 3); // Produces no output
        printGrid(4, 6);
        largerAbsVal(11, -22);
        largestAbsVal(7, 38, -122);
        System.out.println("The last digit is " + lastDigit(-3657));
    }

    public static void printNumbers(int num) {
        for(int i = 1; i <= num; i++) {
            System.out.print("[" + i + "] ");
        }
    }

    public static void printPowersOf2(int num) {
        for(int i = 0; i <= num; i++) {
            System.out.print((int) Math.pow(2, i) + " ");
        }
    }

    public static void printPowersOfN(int a, int b) {
        for(int i = 0; i <= b; i++) {
            System.out.print((int) Math.pow(a, i) + " ");
        }
    }

    public static void printSquare(int min, int max) {
        for(int x = min; x <= max; x++) {
            for(int i = x; i <= max; i++) {
                System.out.print(i);
            }
            for(int j = min; j < x; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void printGrid(int row, int column) {
        for(int x = 1; x <= row; x++) {
            for(int y = 0; y < column; y++) {
                System.out.print(x + y * row + " ");
            }
            System.out.println();
        }
    }

    public static void largerAbsVal(int a, int b) {
        System.out.println("The largest number is " + Math.max(Math.abs(a), Math.abs(b)));
    }

    public static void largestAbsVal(int a, int b, int c) {
        int a1 = Math.abs(a);
        int b1 = Math.abs(b);
        int c1 = Math.abs(c);
        System.out.println("The largest number is " + Math.max(Math.max(a1, b1), Math.max(b1, c1)));
    }

    public static int lastDigit(int num) {
        return Math.abs(num % 10);
    }
}
