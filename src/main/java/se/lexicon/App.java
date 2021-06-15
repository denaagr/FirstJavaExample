package se.lexicon;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){

        BankAccount bank=new BankAccount(500,"Dena Aghajari","d.adr@gmail.com",070223344);
          bank.deposit(1000);
        System.out.println("Current balance:"+bank.getBalance());
          bank.deposit(100);
        System.out.println("Current balance:"+bank.getBalance());
        System.out.println("bank account num:"+bank.counter);







    }
}