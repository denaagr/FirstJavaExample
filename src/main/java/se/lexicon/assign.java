package se.lexicon;

import java.util.Scanner;

public class assign {

    public static void main(String[] args){
        System.out.println("Hello");
        String name="Dena";
        System.out.println(name);
        System.out.println("------------------------");

        Scanner scan=new Scanner(System.in);
        System.out.println("write any year:");
        int year;
        year=scan.nextInt();
        boolean leap=false;
        if (year%4==0){
            if (year%100==0){
                if(year%400==0)
                    leap=true;
            }else
                leap=false;
        }
        if(leap==true)
            System.out.println(year +" is leap");
        else
            System.out.println(year +" is not leap");















    }







}
