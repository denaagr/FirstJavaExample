package se.lexicon;

import java.util.Scanner;

public class Assign {
    // variables- global - local
    // methods - behaviors

    public static void main(String[] args) {

        boolean check=true;
        while(check) {
            print();

            Scanner scan = new Scanner(System.in);
            String press = scan.nextLine();
            if (press.equals("no")){
                break;
            }
            System.out.println("Enter two numbers:");



            switch (press) {
                case "ad":
                    addition();
                    break;

                case "s":
                    subtraction();
                    break;
                case "d":
                    division();
                    break;
                case "m":
                   multiplication();
                    break;

                default:
                    System.out.println("operation invalid");

            }
        }
        System.out.println("done");
        }

        public static void print() {
            System.out.println("wellcome");
            System.out.println("for addition press 'ad', for subtraction press 's'");
            System.out.println("for division press 'd',for multiplication press 'm'");
            System.out.println("press no to end");
        }
       public static void addition(){
           Scanner scan = new Scanner(System.in);
           int a = scan.nextInt();
           int b = scan.nextInt();
           int sum = a + b;
           System.out.println(a + "+" + b + "=" + sum);
       }
    public static void subtraction(){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        int sub = a - b;
        System.out.println(a + "-" + b + "=" + sub);
    }
    public static void division(){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        double div = a / b;
        System.out.println(a + "/" + b + "=" + div);
    }
    public static void multiplication(){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();        int mul = a * b;
        System.out.println(a + "*" + b + "=" + mul);
    }
    }



