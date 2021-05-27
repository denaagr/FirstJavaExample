package se.lexicon;

import java.util.Scanner;

public class Assign {
    // variables- global - local
    // methods - behaviors

    public static void main(String[] args) {
        System.out.println("for addition press 'ad', for subtraction press 's', for division press 'd',for multiplication press 'm'");
        Scanner scan = new Scanner(System.in);
        String press=scan.nextLine();
        if (press=="ad") {
            addition();
        }
        if (press=="s") {
            subtraction();
        }
        if (press=="d") {
            division();
        }
        if (press=="m") {
            multiplication();
        }
        }


    public static void addition() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int sum = a + b;
        System.out.println(a + "+" + b + "=" + sum);
    }

    public static void subtraction() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int sub = a - b;
        System.out.println(a + "-" + b + "=" + sub);
    }

    public static void multiplication() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int mul = a * b;
        System.out.println(a + "*" + b + "=" + mul);
    }

    public static void division() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = scan.nextInt();
        int b = scan.nextInt();
        double div = a / b;
        System.out.println(a + "/" + b + "=" + div);


    }
}

