import java.util.*;

public class addingInput {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of a :");
        int a = sc.nextInt();
        System.out.print("Enter the value of b :");
        int b = sc.nextInt();

        System.out.print("sum of both the number:");
        int sum = a + b;
        System.out.println(sum);

        System.out.print("difference of both the number:");
        int difference = a - b;
        System.out.println(difference);

        System.out.print("product of both the number:");
        int product = a * b;
        System.out.println(product);

    }
}
