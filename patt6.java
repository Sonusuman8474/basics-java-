public class patt6 {
    public static void number_paramid(int line, int n) {
        int number;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + "");
            }
            System.out.println("");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        number_paramid(1, 5);
    }
}
