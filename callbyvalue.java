public class callbyvalue {
    public static int multiply(int a, int b) {
        int product = a * b;
        return product;
    }

    public static void main(String args[]) {
        int a = 2;
        int b = 6;
        int product = multiply(a, b);
        System.out.println("a*b = " + product);
    }
}
