package parameters;

public class random {
    public static void main(String args[]) {
        printNumbers(15);
        System.out.println();
        printPowersOf2(10);
        System.out.println();
        printPowersOfN(-2, 8);
        System.out.println();
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
}
