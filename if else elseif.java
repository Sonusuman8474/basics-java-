
//if else stetement

/*

import java.util.*;

public class zz {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the number :");
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println(" number is even .");
        } else {
            System.out.println("number is odd .");
        }
    }
}
    
*/

// if , else-if , else statement

/* 
import java.util.*;

public class zz {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the age of people :");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("people is adult.");
        } else if (age >= 13 && age <= 18) {
            System.out.println("people is teenager.");
        } else {
            System.out.println("people is child.");
        }
    }
}

*/

/*
import java.util.*;

public class zz {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the age of people :");
        int income = sc.nextInt();

        if (income < 500000) {
            System.out.println("tex is 0%.");
        }

        else if (income > 500000 && income < 1000000) {
            System.out.println("tex is 20%.");
        } else {
            System.out.println("tex is 30%.");
        }
    }
}
    */

import java.util.*;

public class zz {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the value of a :");
        int a = sc.nextInt();

        System.out.print("enter the value of b :");
        int b = sc.nextInt();

        System.out.print("enter the value of c :");
        int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println("value of a is greater.");
        } else if (b > c) {
            System.out.println("value of b is greater.");
        } else {
            System.out.println("value of c is greater.");
        }
    }
}
