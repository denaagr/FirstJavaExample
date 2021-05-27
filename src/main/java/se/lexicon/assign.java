package se.lexicon;

import java.util.Scanner;

public class assign {

    public static void main(String[] args){
        int first, second, add, mul , sub;
        double div;

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the first number:");
        first= scan.nextInt();
        System.out.println("Enter the second number:");
        second= scan.nextInt();

        add=first+second;
        System.out.println("result:");
        System.out.println(first+"+"+second+"="+add);

        mul=first*second;
        System.out.println(first+"*"+second+"="+mul);

        div=first/second;
        System.out.println(first+"/"+second+"="+div);

        sub=first-second;
        System.out.println(first+"-"+second+"="+sub);






















    }







}
