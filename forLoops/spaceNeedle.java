package forLoops;

public class spaceNeedle {
    public static void main(String args[]) {

        drawPole();
        // drawBase();
        // drawBottom();
        // drawPole();
        // drawBody();
        // drawBase();
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
   
}
