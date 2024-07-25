public class rev {
    public static void min(String args[]) {
        System.out.println("Enter the number :");
        Scanner sc = new Scanner(System.in);
        int n = nextInt();
        while (n > 0) {
            lastdigit = n % 10;
            System.out.println(lastdigit);
            n = n / 10;
        }
        system.out.println();
    }
}
