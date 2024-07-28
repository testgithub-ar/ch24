public class Pattern {
    public static void main(String[] args) {
        int rows = 5; // Number of rows
        int columns = 5; // Number of columns

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                // Print star for first or last row, or first or last column
                if (i == 1 || i == rows || j == 1 || j == columns) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}