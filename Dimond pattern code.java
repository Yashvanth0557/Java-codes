public class DiamondPattern {
    public static void main(String[] args) {

        // Upper part
        for (int i = 1; i <= 3; i++) {
            for (int j = 3; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower part
        for (int i = 2; i >= 1; i--) {
            for (int j = 3; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
