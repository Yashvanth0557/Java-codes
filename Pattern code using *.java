public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) {

            // Print spaces
            for (int j = 4; j > i; j--) {
                System.out.print("  ");
            }

            // Print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
