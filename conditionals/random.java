package conditionals;

public class random {
    public static void main(String args[]) {
        System.out.println(fractionSum(3));
        System.out.println(fractionSum(2));
        System.out.println(fractionSum(10));
        System.out.println(repl("intensify", 7));
        System.out.println(daysInMonth(2));
        printRange(17, 2);
        printRange(3, 25);
        printRange(5, 5);
    }

    // Return the sum of the sequence (1/n) for a given number n
    public static double fractionSum(int n) {
        if(n <= 0) {
            throw new IllegalArgumentException("number must be bigger than 0!");
        } else {
            double result = 0;
            for(int i = 1; i <= n; i++) {
                result += (double) 1 / i;
            }
            return result;
        }
    }

    public static String repl(String sentence, int times) {
        if(times <= 0) {
            return "";
        } else {
            String result = "";
            for(int i = 0; i < times; i++) {
                result += sentence;
            }
            return result;
        }
    }

    public static int daysInMonth(int month) {
        if(month <= 0 || month > 12) {
            throw new IllegalArgumentException("Invalid month!!!");
        }else if(month == 2) {
            return 28;
        } else if(month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        } else {
            return 31;
        }
    }
    public static void printRange(int a, int b) {
        if(a == b) {
            System.out.println(a);
        } else if(a > b) {
            for(int i = a; i >= b; i--) {
                System.out.print(i + " ");
            }
            System.out.println();
        } else {
            for(int i = a; i <= b; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
