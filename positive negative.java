import java.util.Scanner;

public class takeinput {
    public static void main(String args[]) {
        System.out.println("Enter the number :");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        if (n > 0) {
            System.out.println("number is positive ");
        } else {
            System.out.println("number is negative ");
        }

    }
}