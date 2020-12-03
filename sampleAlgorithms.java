public class sampleAlgorithms {
    public static void main(String args[]) {
        int a = 64;
        int b = 8;
        int c = 9;
        System.out.println(add(a, b));
        System.out.println(subtract(a, b));
        System.out.println(multiply(a, b));
        System.out.println(divide(a, b));
        System.out.println(remainder(a, c));
    }
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }
    public static int remainder(int a, int b) {
        return a % b;
    }
}