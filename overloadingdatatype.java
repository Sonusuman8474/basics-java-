public class overloadingdatatype {

    public static int sum(int a, int b) {
        return a + b;
    }

    public static float sum(float a, float b) {
        return a + b;
    }

    public static void main(String args[]) {
        System.out.println("sum = " + sum(3, 5));
        System.out.println("sum = " + sum(5.3f, 6.6f));
    }
}
