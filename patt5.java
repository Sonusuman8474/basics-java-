public class patt5 {
    // fuction declear
    public static void hollow_ractangle(int totRow, int totCols) {
        // inner loop
        for (int i = 1; i <= totRow; i++) {
            // outer loop
            for (int j = 1; j <= totCols; j++) {
                // boundary = yha pr ek bhi condition true ho gya to vo print ho jayega
                if (i == 1 || i == totRow || j == 1 || j == totCols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        hollow_ractangle(4, 5);
    }
}