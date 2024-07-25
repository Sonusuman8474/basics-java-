public class patt7 {
    public static void number_paramid(int line, int n) {
        int counter = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println("");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        number_paramid(1, 5);
    }
}
