//Write a Java method to compute the averageof three numbers

import java.util.Scanner;

public class avg {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the first number :");
        int a = sc.nextInt();

        System.out.print("enter the second number :");
        int b = sc.nextInt();

        System.out.print("enter the thired number :");
        int c = sc.nextInt();

        System.out.print("enter the four number :");
        int d = sc.nextInt();

        System.out.print("average = " + average(a, b, c, d));

    }

    public static int average(int a, int b, int c, int d) {
        return a + b + c + d / 4;

    }
}